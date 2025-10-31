# 🎓 Java Practical Exam

## Ubuntu Project - Java 2025

A practical Java exam covering essential concepts from OOP to multithreading.

## 🚀 Quick Start

### Run the Exam

```powershell
cd demo
.\gradlew.bat bootRun
```

## 📝 Exercises

### Section 1: Theoretical Questions

#### Exercise 1: JVM, JRE, JDK and Primitive vs Reference Types
Briefly explain what the JVM, JRE, and JDK are. Then, explain the fundamental difference in how Java stores Primitive Types (e.g., int) and Reference Types (e.g., String) in memory.

---

#### Exercise 2: Encapsulation, Abstraction, and Interfaces
Explain the two Object-Oriented Programming (OOP) pillars of Encapsulation and Abstraction. Then, define what a Java Interface is and what its primary function is in system design.

---

#### Exercise 3: Exception Handling and Control Flow Statements
Describe the purpose of a try-catch-finally block in exception handling. Additionally, mention and give an example of two different types of Control Flow Statements used for making decisions or repeating code (e.g., if, for).

---

#### Exercise 4: HashMap Internals and Synchronization
Describe what happens internally in a HashMap when a new key-value is inserted. In the context of Multithreading, explain why Synchronization (synchronized) is necessary when working with shared resources.

---

#### Exercise 5: Record Classes and Thread Pools
Describe the main goal of Record Classes in Java. In the realm of Thread Pools, explain the advantage of using a FixedThreadPool instead of creating a new Thread for every single task.

---

### Section 2: Practical Exercises

#### Exercise 6: Task Class
Create a class named Task with the following attributes: int id, String description, and boolean isCompleted. The class must have Getters and Setters methods, an Empty Constructor, and a Constructor with all attributes.

---

#### Exercise 7: Create Task Instances
Using the Task class from Exercise 6, create three instances with the following data, and then print the values of all attributes for each instance:
- taskA: id=1, description="Implement Login", isCompleted=false
- taskB: id=2, description="Fix Bug", isCompleted=true
- taskC: id=3, description="Refactor Code", isCompleted=false

---

#### Exercise 8: ArrayList of Tasks
Create an ArrayList to store Task objects (from Exercise 6). Add the three objects created in Exercise 7 to this list. Print the entire list to the console.

---

#### Exercise 9: Streams API with Tasks
Use the list of Task from Exercise 8 and the Streams API to perform the following actions:
- Filtering: Print only the tasks where the isCompleted attribute is false
- Counting: Print the total number of tasks in the list

---

#### Exercise 10: ExecutorService with FixedThreadPool
Implement a program to demonstrate thread execution using an ExecutorService. Create a class that implements the Runnable interface and prints the current thread's name. In the main method, use an ExecutorService with a FixedThreadPool (size 2) to execute 4 instances of your Runnable class. Be sure to call shutdown() to properly terminate the ExecutorService.

---

## 📂 Project Structure

```
demo/src/main/java/com/ununtu/demo/exercises/
├── Exercise1.java   (JVM, JRE, JDK & Primitive vs Reference Types)
├── Exercise2.java   (Encapsulation, Abstraction & Interfaces)
├── Exercise3.java   (Exception Handling & Control Flow)
├── Exercise4.java   (HashMap Internals & Synchronization)
├── Exercise5.java   (Record Classes & Thread Pools)
├── Exercise6.java   (Task Class)
├── Exercise7.java   (Create Task Instances)
├── Exercise8.java   (ArrayList of Tasks)
├── Exercise9.java   (Streams API with Tasks)
└── Exercise10.java  (ExecutorService with FixedThreadPool)
```

## 🎯 For Students

1. Open each exercise file
2. Read the instructions in the comments
3. Complete the TODO sections
4. Run the application to test your code
5. Remove the warning message when done

## 📊 Topics Covered

| Exercise | Section | Topic | Key Concepts |
|----------|---------|-------|--------------|
| 1 | 1 | Java Platform & Memory | JVM, JRE, JDK, Primitive vs Reference Types |
| 2 | 1 | OOP Fundamentals | Encapsulation, Abstraction, Interfaces |
| 3 | 1 | Exception Handling & Control Flow | try-catch-finally, Control Flow Statements |
| 4 | 1 | Collections & Multithreading | HashMap internals, Synchronization |
| 5 | 1 | Modern Java Features | Record Classes, Thread Pools |
| 6 | 2 | Classes & Constructors | Class creation, Getters/Setters, Constructors |
| 7 | 2 | Object Instantiation | Creating objects, Printing attributes |
| 8 | 2 | Collections Framework | ArrayList, Adding objects |
| 9 | 2 | Streams API | Filtering, Counting |
| 10 | 2 | Concurrency | ExecutorService, FixedThreadPool, Runnable |

## 🛠️ Technologies

- **Java 17**
- **Spring Boot 3.5.6**
- **Gradle 8.14.3**

## 📄 License

Educational material for Java 2025 course.

---

**Good luck! 🎉**
