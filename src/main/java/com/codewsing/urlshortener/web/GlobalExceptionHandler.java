package com.codewsing.urlshortener.web;

import com.codewsing.urlshortener.domain.exceptions.ShortUrlNotFoundException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ShortUrlNotFoundException.class)
    String handleShortUrlNotFoundException (ShortUrlNotFoundException ex) {
        return "error/404";

    }
}
