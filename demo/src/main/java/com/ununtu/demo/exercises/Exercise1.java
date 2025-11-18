package com.ununtu.demo.exercises;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

/**
 * ═══════════════════════════════════════════════════════════════════════════════
 * EXERCISE 1
 * ═══════════════════════════════════════════════════════════════════════════════
 * 
 * TASK: Measure how long each HTTP request takes
 * 
 * TODO 1: Set startTime attribute to request with value System.currentTimeMillis() in preHandle()
 * TODO 2: Get startTime attribute from request, calculate duration, and print "Request completed in Xms" in afterCompletion()
 * 
 * ═══════════════════════════════════════════════════════════════════════════════
 */
@Component
public class Exercise1 implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        // TODO: Set startTime attribute to request, with the value System.currentTimeMillis()

        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        // TODO: Get startTime attribute from request, calculate duration, and print "Request completed in Xms"
        Long startTime = null;

        if (startTime != null) {
            long duration = System.currentTimeMillis() - startTime;
            System.out.println("Request completed in " + duration + "ms");
        }
    }

}
