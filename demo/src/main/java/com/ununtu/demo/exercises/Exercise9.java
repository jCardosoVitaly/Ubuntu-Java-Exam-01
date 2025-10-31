package com.ununtu.demo.exercises;

/**
 * Exercise 9: Exception Handling
 * 
 * OBJECTIVE: Master exception handling in Java
 * 
 * DETAILED INSTRUCTIONS:
 * 
 * 1. TRY-CATCH-FINALLY:
 *    - try: Code that might throw an exception
 *    - catch: Handle the exception
 *    - finally: Always executes (cleanup code)
 *
 * 2. CUSTOM EXCEPTION:
 *    Using the InvalidAgeException  exception class cointained in the validateAge method:
 *    - Throw and catch it and show the message error on console
 */
public class Exercise9 {

    public static void run() {
        System.out.println("\n=== EXERCISE 9: Exception Handling ===\n");
        
        // TODO: STEP 1 - Basic try-catch-finally
        System.out.println("⚠️ TRY-CATCH-FINALLY:");

        System.out.println();

        // TODO: STEP 2 - Custom exception
        System.out.println("🎯 CUSTOM EXCEPTION:");

        System.out.println();

        System.out.println("\n⚠️ Exercise not implemented yet!");
    }

    // Custom exception
    static class InvalidAgeException extends Exception {
         InvalidAgeException(String message) {
             super(message);
         }
     }
    
     static void validateAge(int age) throws InvalidAgeException {
         if (age < 18) {
             throw new InvalidAgeException("Must be 18+");
         }
     }
}
