# 🎓 Java Advanced Practical Exam

## Ubuntu Project - Java 2025

## 📝 Exercises

This exam consists of **5 practical exercises** covering advanced Spring Boot topics.

### Exercise 1: Custom Interceptors
**Task:** Measure how long each HTTP request takes

**TODOs:**
1. Set `startTime` attribute to request with value `System.currentTimeMillis()` in `preHandle()`
2. Get `startTime` attribute from request, calculate duration, and print "Request completed in Xms" in `afterCompletion()`

**File:** `Exercise1.java`

---

### Exercise 2: Exception Handling
**Task:** Handle ProductNotFoundException and return proper 404 JSON response

**TODOs:**
1. Return `ResponseEntity` with body and `NOT_FOUND` status for `ProductNotFoundException`
2. Add another `@ExceptionHandler` for `IllegalArgumentException` that returns `BAD_REQUEST` (400)

**File:** `Exercise2.java`

---

### Exercise 3: JPA Relationships - Avoiding N+1 Problem
**Task:** Join the class Product with Category with annotations and add @Query annotation with JPQL to obtain every product of every category

**TODOs:**
1. Add `fetch = FetchType.LAZY` and `@JoinColumn(name = "name of the bonding column")` to the `@ManyToOne` in Product class
2. Add `@Query` annotation with JPQL to `findAllWithProducts()` method

**File:** `Exercise3.java`

---

### Exercise 4: Native Query
**Task:** Find products with price above a value using Native SQL

**TODOs:**
1. Replace the comment with the query in order to obtain a price higher than the input parameter (Native SQL query)
2. Add parameter `Double minPrice` with the proper annotation 

**File:** `Exercise4.java`

---

### Exercise 5: Spring Security - User Creation & Password Encryption
**Task:** Encrypt password before saving user

**TODOs:**
1. Encrypt the password using `passwordEncoder.encode()` in `createUser()` method
2. Create a method to validate login: compare `plainPassword` with stored encrypted password using `passwordEncoder` in `validatePassword()` method
3. The `SecurityConfig` class already has the `@Bean` for `BCryptPasswordEncoder` configured

**File:** `Exercise5.java`

---


## 🎯 Instructions for Students

1. **Navigate to the exercises folder:**
   ```
   demo/src/main/java/com/ununtu/demo/exercises/
   ```

2. **Open each exercise file** (Exercise1.java through Exercise5.java)

3. **Read the instructions** carefully in the comments at the top of each file

4. **Complete the TODO sections** marked in the code


---

**Good luck with your exam! 🎉**

*Remember: Understanding is more important than memorization. Focus on learning the concepts!*
