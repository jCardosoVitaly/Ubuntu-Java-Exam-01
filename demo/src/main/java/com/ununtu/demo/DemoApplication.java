package com.ununtu.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.ununtu.demo.exercises.*;

import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        
        displayWelcome();
        displayMenu();
        runExam();
    }

    private static void displayWelcome() {
        System.out.println("\n");
        System.out.println("╔═══════════════════════════════════════════════════════════╗");
        System.out.println("║                                                           ║");
        System.out.println("║              ¡WELCOME TO THE JAVA EXAM!                   ║");
        System.out.println("║                                                           ║");
        System.out.println("║                     Ubuntu Project                        ║");
        System.out.println("║                                                           ║");
        System.out.println("╚═══════════════════════════════════════════════════════════╝");
        System.out.println("\n");
    }

    private static void displayMenu() {
        System.out.println("🧮 Java Practical Exam – Advanced Level");
        System.out.println("═══════════════════════════════════════════════════════════\n");
        System.out.println("Available Exercises:");
        System.out.println("  1️⃣  Exercise 1: 4 Pillars of OOP");
        System.out.println("  2️⃣  Exercise 2: JVM, JRE, and JDK");
        System.out.println("  3️⃣  Exercise 3: Primitive vs Reference Types");
        System.out.println("  4️⃣  Exercise 4: Methods and Constructors");
        System.out.println("  5️⃣  Exercise 5: Memory Management");
        System.out.println("  6️⃣  Exercise 6: Abstract Classes and Enums");
        System.out.println("  7️⃣  Exercise 7: Lambda Expressions");
        System.out.println("  8️⃣  Exercise 8: Collections Framework");
        System.out.println("  9️⃣  Exercise 9: Exception Handling");
        System.out.println("  🔟 Exercise 10: Multithreading");
        System.out.println("  0️⃣  Run ALL exercises");
        System.out.println("\n═══════════════════════════════════════════════════════════\n");
    }

    private static void runExam() {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Select an exercise (0-10) or press Enter to run all: ");
            String input = scanner.nextLine().trim();
            
            if (input.isEmpty() || input.equals("0")) {
                runAllExercises();
            } else {
                int choice = Integer.parseInt(input);
                runExercise(choice);
            }
        } catch (Exception e) {
            System.out.println("\nRunning all exercises by default...\n");
            runAllExercises();
        }
        
        System.out.println("\n╔═══════════════════════════════════════════════════════════╗");
        System.out.println("║                                                           ║");
        System.out.println("║                  EXAM COMPLETED! 🎉                       ║");
        System.out.println("║                                                           ║");
        System.out.println("║              Good luck with your studies!                 ║");
        System.out.println("║                                                           ║");
        System.out.println("╚═══════════════════════════════════════════════════════════╝\n");
    }

    private static void runAllExercises() {
        System.out.println("Running all exercises...\n");
        for (int i = 1; i <= 10; i++) {
            runExercise(i);
            System.out.println("\n" + "─".repeat(63) + "\n");
        }
    }

    private static void runExercise(int exerciseNumber) {
        try {
            switch (exerciseNumber) {
                case 1:
                    Exercise1.run();
                    break;
                case 2:
                    Exercise2.run();
                    break;
                case 3:
                    Exercise3.run();
                    break;
                case 4:
                    Exercise4.run();
                    break;
                case 5:
                    Exercise5.run();
                    break;
                case 6:
                    Exercise6.run();
                    break;
                case 7:
                    Exercise7.run();
                    break;
                case 8:
                    Exercise8.run();
                    break;
                case 9:
                    Exercise9.run();
                    break;
                case 10:
                    Exercise10.run();
                    break;
                default:
                    System.out.println("Invalid exercise number. Please select 0-10.");
            }
        } catch (Exception e) {
            System.out.println("Error running exercise " + exerciseNumber + ": " + e.getMessage());
            e.printStackTrace();
        }
    }
}
