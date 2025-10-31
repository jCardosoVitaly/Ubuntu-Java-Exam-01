package com.ununtu.demo.exercises;

/**
 * Exercise 7: Lambda Expressions
 * 
 * OBJECTIVE: Master lambda expressions with functional interfaces
 * 
 * DETAILED INSTRUCTIONS:
 * 
 * 1. Use the StringProcessor functional interface (already created below)
 * 
 * 2. Create lambda expressions to implement different string operations:
 *    - Convert to uppercase
 *    - Reverse the string using reverse().toString();
 *
 * EXPECTED OUTPUT EXAMPLE:
 * === LAMBDA EXPRESSIONS ===
 * Original text: hello world
 * 
 * Uppercase: HELLO WORLD
 * Reversed: dlrow olleh
 */
public class Exercise7 {

    public static void run() {
        System.out.println("\n=== EXERCISE 7: Lambda Expressions ===\n");
        
        // TODO: STEP 1 - Create lambda to convert to uppercase

        // TODO: STEP 2 - Create lambda to reverse string

        
        System.out.println("\n⚠️ Exercise not implemented yet!");
    }

    // Functional interface (already created for you)
    @FunctionalInterface
    interface StringProcessor {
        String process(String input);
    }
}
