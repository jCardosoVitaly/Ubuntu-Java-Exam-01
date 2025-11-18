# 🎓 Java Advanced Practical Exam

## Ubuntu Project - Java 2025

A practical Java exam covering advanced Spring Boot concepts including Interceptors, Exception Handling, JPA Relationships, Native Queries, and Spring Security.

## 🚀 Quick Start

### Prerequisites

- Java 17 or higher
- Gradle 8.14.3 or higher

### Run the Application

```powershell
cd demo
.\gradlew.bat bootRun
```

Or on Linux/Mac:

```bash
cd demo
./gradlew bootRun
```

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
2. Add `@Query` annotation with JPQL: `"SELECT c FROM Category c LEFT JOIN FETCH c.products"` to `findAllWithProducts()` method

**File:** `Exercise3.java`

---

### Exercise 4: Native Query
**Task:** Find products with price above a value using Native SQL

**TODOs:**
1. Replace the comment with the query in order to obtain a price higher than the input parameter (Native SQL query)
2. Add parameter `Double minPrice` with the proper annotation (`@Param`)

**File:** `Exercise4.java`

---

### Exercise 5: Spring Security - User Creation & Password Encryption
**Task:** Encrypt password before saving user

**TODOs:**
1. Encrypt the password using `passwordEncoder.encode()` in `createUser()` method
2. Create a method to validate login: compare `plainPassword` with stored encrypted password using `passwordEncoder.matches()` in `validatePassword()` method
3. The `SecurityConfig` class already has the `@Bean` for `BCryptPasswordEncoder` configured

**File:** `Exercise5.java`

---

## 📂 Project Structure

```
demo/
├── src/main/java/com/ununtu/demo/
│   ├── DemoApplication.java
│   └── exercises/
│       ├── Exercise1.java   (Custom Interceptors)
│       ├── Exercise2.java   (Exception Handling)
│       ├── Exercise3.java   (JPA Relationships - N+1 Problem)
│       ├── Exercise4.java   (Native Query)
│       └── Exercise5.java   (Spring Security - Password Encryption)
├── build.gradle
└── README.md
```

## 🎯 Instructions for Students

1. **Navigate to the exercises folder:**
   ```
   demo/src/main/java/com/ununtu/demo/exercises/
   ```

2. **Open each exercise file** (Exercise1.java through Exercise5.java)

3. **Read the instructions** carefully in the comments at the top of each file

4. **Complete the TODO sections** marked in the code

5. **Test your implementation** by running the application

6. **Verify** that your code compiles without errors

## 📊 Topics Covered

| Exercise | Topic | Difficulty | Key Technologies |
|----------|-------|------------|------------------|
| 1 | Custom Interceptors | ⭐⭐ | Spring MVC, HandlerInterceptor |
| 2 | Exception Handling | ⭐⭐ | @RestControllerAdvice, @ExceptionHandler |
| 3 | JPA Relationships | ⭐⭐⭐ | JPA, JPQL, Lazy Loading, JOIN FETCH |
| 4 | Native Query | ⭐⭐ | JPA, Native SQL, @Query |
| 5 | Spring Security | ⭐⭐⭐ | BCrypt, PasswordEncoder, @Configuration |

## 🛠️ Technologies & Dependencies

- **Java 17**
- **Spring Boot 3.5.6**
  - spring-boot-starter-web
  - spring-boot-starter-data-jpa
  - spring-boot-starter-security
  - spring-boot-starter-oauth2-client
  - spring-boot-starter-cache
- **Gradle 8.14.3**
- **H2 Database** (in-memory)
- **JWT** (io.jsonwebtoken:jjwt-api:0.11.5)
- **Feign Client** (Spring Cloud OpenFeign)
- **Hibernate JCache & EhCache**

## 💡 Tips

- Read all comments carefully before starting
- Each exercise builds on Spring Boot concepts
- Test your code incrementally
- Use the provided structure - don't create new files
- Pay attention to annotations and their parameters
- Remember to handle null values appropriately

## 📚 Learning Objectives

By completing this exam, you will demonstrate understanding of:

✅ Creating and configuring Spring Boot interceptors  
✅ Implementing centralized exception handling  
✅ Working with JPA relationships and avoiding N+1 queries  
✅ Writing native SQL queries in Spring Data JPA  
✅ Implementing secure password storage with BCrypt  
✅ Configuring Spring Security beans  

## 🔧 Troubleshooting

### Gradle Build Issues
```bash
./gradlew clean build --refresh-dependencies
```

### IDE Not Recognizing Dependencies
- Refresh Gradle project in your IDE
- Invalidate caches and restart (IntelliJ IDEA)

### Port Already in Use
Change the port in `application.properties`:
```properties
server.port=8081
```

## 📄 License

Educational material for Java 2025 course - Ubuntu Project.

---

**Good luck with your exam! 🎉**

*Remember: Understanding is more important than memorization. Focus on learning the concepts!*
