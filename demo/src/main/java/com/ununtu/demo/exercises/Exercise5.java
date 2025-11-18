package com.ununtu.demo.exercises;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * ═══════════════════════════════════════════════════════════════════════════════
 * EXERCISE 5
 * ═══════════════════════════════════════════════════════════════════════════════
 * 
 * TASK: Encrypt password before saving user
 * 
 * TODO 1: Encrypt the password using passwordEncoder in createUser() method
 * TODO 2: Create a method to validate login: compare plainPassword with stored encrypted password 
 *         using passwordEncoder in validatePassword() method
 * TODO 3: The SecurityConfig class already has the @Bean for BCryptPasswordEncoder configured
 * 
 * ═══════════════════════════════════════════════════════════════════════════════
 */
public class Exercise5 {

    @Entity
    @Table(name = "users")
    public static class User {
        @Id
        private Long id;
        private String username;
        private String password;

        public void setUsername(String username) { this.username = username; }
        public void setPassword(String password) { this.password = password; }
    }

    @Repository
    public interface UserRepository extends JpaRepository<User, Long> {
    }

    @Service
    public static class UserService {
        @Autowired
        private UserRepository userRepository;
        
        @Autowired
        private PasswordEncoder passwordEncoder;

        public User createUser(String username, String plainPassword) {
            // TODO: Encrypt the password using passwordEncoder
            String encryptedPassword = null;

            User user = new User();
            user.setUsername(username);
            user.setPassword(encryptedPassword);
            return userRepository.save(user);
        }

        // TODO: Create a method to validate login: compare plainPassword with stored encrypted password

        // Use passwordEncoder
        public boolean validatePassword(String plainPassword, String encryptedPassword) {
            return false;
        }
    }

    @Configuration
    public static class SecurityConfig {

        @Bean
        public PasswordEncoder passwordEncoder() {
            return new BCryptPasswordEncoder();
        }
    }
}
