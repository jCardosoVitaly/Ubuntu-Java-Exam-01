package com.ununtu.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        
        displayWelcome();
        displayMenu();
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
        System.out.println("  1️⃣  Exercise 1: Custom Interceptors");
        System.out.println("  2️⃣  Exercise 2: Exception Handling");
        System.out.println("  3️⃣  Exercise 3: JPA Relationships - N+1 Problem");
        System.out.println("  4️⃣  Exercise 4: Native Query");
        System.out.println("  5️⃣  Exercise 5: Spring Security - User Creation & Password Encryption");
        System.out.println("\n═══════════════════════════════════════════════════════════\n");
        System.out.println("📝 Complete the TODOs in each exercise file");
        System.out.println("📂 Location: src/main/java/com/ununtu/demo/exercises/");
        System.out.println("\n═══════════════════════════════════════════════════════════\n");
    }
}
