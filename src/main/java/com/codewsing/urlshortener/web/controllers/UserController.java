package com.codewsing.urlshortener.web.controllers;

import com.codewsing.urlshortener.domain.entities.User;
import com.codewsing.urlshortener.domain.models.CreateUserCmd;
import com.codewsing.urlshortener.domain.models.Role;
import com.codewsing.urlshortener.domain.repositories.UserRepository;
import com.codewsing.urlshortener.domain.services.UserService;
import com.codewsing.urlshortener.web.dtos.RegisterUserRequest;
import jakarta.validation.Valid;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class UserController {

    private final UserRepository userRepository;
    private final UserService userService;

    public UserController(UserRepository userRepository, UserService userService) {
        this.userRepository = userRepository;
        this.userService = userService;
    }

    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute("user", new RegisterUserRequest("","",""));
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(
            @Valid @ModelAttribute("user") RegisterUserRequest registerRequest,
            BindingResult bindingResult,
            RedirectAttributes redirectAttributes){
        if (bindingResult.hasErrors()) {
            return "register";
        }
        try {
            var cmd = new CreateUserCmd(
                    registerRequest.email(),
                    registerRequest
                            .password(),
                    registerRequest.name(),
                    Role.ROLE_USER
            );

            userService.createUser(cmd);
            redirectAttributes.addFlashAttribute("successMessage", "Registration successful! Please login.");
            return "redirect:/login";
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("errorMessage", "Registration failed: " + e.getMessage());
            return "redirect:/register";
        }
    }
}
