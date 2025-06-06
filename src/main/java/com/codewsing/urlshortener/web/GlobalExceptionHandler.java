package com.codewsing.urlshortener.web;

import com.codewsing.urlshortener.domain.exceptions.ShortUrlNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(ShortUrlNotFoundException.class)
    String handleShortUrlNotFoundException (ShortUrlNotFoundException ex) {
        log.error("Short URL not found: {}", ex.getMessage());
        return "error/404";
    }

    @ExceptionHandler(Exception.class)
    String handleException (ShortUrlNotFoundException ex) {
        log.error("Unhandled Exception: {}", ex.getMessage(), ex);
        return "error/500";
    }
}
