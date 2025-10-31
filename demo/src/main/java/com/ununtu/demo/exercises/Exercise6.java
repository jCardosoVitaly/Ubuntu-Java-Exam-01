package com.ununtu.demo.exercises;

/**
 * Exercise 6: Abstract Classes and Enums
 * 
 * OBJECTIVE: Master abstract classes and enumerations in Java
 * 
 * DETAILED INSTRUCTIONS:
 * 
 * 1. ABSTRACT CLASS:
 *    Create an abstract class Payment with:
 *    - Abstract method: void processPayment(double amount)
 *    - Abstract method: String getPaymentType()
 *    - Concrete method: void printReceipt(double amount)
 *    
 *    Then create two concrete classes:
 *    - CreditCardPayment extends Payment
 *    - CashPayment extends Payment
 * 
 * 2. ENUM:
 *    Create an enum PaymentStatus with values:
 *    - PENDING, PROCESSING, COMPLETED, FAILED
 *    
 *    Add a method: boolean isFinalized()
 *    - Returns true if COMPLETED or FAILED
 *    - Returns false if PENDING or PROCESSING

 * EXPECTED OUTPUT EXAMPLE:
 * === ABSTRACT CLASS ===
 * Processing Credit Card payment...
 * Payment Type: Credit Card
 * Amount: $150.0
 * Receipt: Payment of $150.0 processed successfully
 * 
 * Processing Cash payment...
 * Payment Type: Cash
 * Amount: $50.0
 * Receipt: Payment of $50.0 processed successfully
 * 
 * === ENUM ===
 * Payment Status: PENDING
 * Is Finalized? false
 * 
 * Payment Status: COMPLETED
 * Is Finalized? true
 * 
 * All Payment Statuses:
 *   PENDING
 *   PROCESSING
 *   COMPLETED
 *   FAILED
 */
public class Exercise6 {

    public static void run() {
        System.out.println("\n=== EXERCISE 6: Abstract Classes and Enums ===\n");
        
        // TODO: STEP 1 - Use abstract class with different payment types
        System.out.println("💳 ABSTRACT CLASS - Payment System:");

        System.out.println();
        
        // TODO: STEP 2 - Use enum for payment status
        System.out.println("📊 ENUM - Payment Status:");
        
        // TODO: STEP 3 - Loop through all enum values
        
        System.out.println("\n⚠️ Exercise not implemented yet!");
    }

}
