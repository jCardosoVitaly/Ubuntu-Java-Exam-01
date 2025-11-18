package com.ununtu.demo.exercises;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 * ═══════════════════════════════════════════════════════════════════════════════
 * EXERCISE 2
 * ═══════════════════════════════════════════════════════════════════════════════
 * 
 * TASK: Handle ProductNotFoundException and return proper 404 JSON response
 * 
 * TODO 1: Return ResponseEntity with body and NOT_FOUND status for ProductNotFoundException
 * TODO 2: Add another @ExceptionHandler for IllegalArgumentException that returns BAD_REQUEST (400)
 * 
 * ═══════════════════════════════════════════════════════════════════════════════
 */
public class Exercise2 {

    public static class ProductNotFoundException extends RuntimeException {
        public ProductNotFoundException(Long id) {
            super("Product not found with id: " + id);
        }
    }

    @RestControllerAdvice
    public static class GlobalExceptionHandler {

        @ExceptionHandler(ProductNotFoundException.class)
        public ResponseEntity<Map<String, Object>> handleProductNotFound(ProductNotFoundException ex) {
            Map<String, Object> body = new HashMap<>();
            body.put("timestamp", LocalDateTime.now());
            body.put("status",    HttpStatus.NOT_FOUND.value());
            body.put("error",     HttpStatus.NOT_FOUND.getReasonPhrase());
            body.put("message",   ex.getMessage());

            // TODO: Return ResponseEntity with body and NOT_FOUND status
            return null;
        }

        // TODO: Add another @ExceptionHandler for IllegalArgumentException that returns BAD_REQUEST (400)
    }
}
