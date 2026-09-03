# Core Java Exercises

This repository contains my hands-on practice with Core Java. I have worked through different programming problems and gradually moved from small coding exercises to a small object-oriented banking application with automated tests.

## What I have worked on

### Strings

String manipulation and problem-solving exercises, including:

* Finding the first and last non-repeating character
* Checking whether a string is a palindrome
* Reversing a string
* Run-length encoding
* Sorting characters in a string

### Arrays

Array-based problem solving, including:

* Finding two numbers that add up to a target
* Finding duplicate values
* Finding the second-largest number
* Checking whether two strings are anagrams using arrays

### Data Structures

Practice using Java collections to solve problems:

* `HashMap` for counting character frequencies
* `Set` for detecting duplicates
* `HashMap` for checking anagrams
* Finding common values between two arrays and sorting the result

### Object-Oriented Programming

I built a small **Banking System** to apply OOP concepts in a practical example.

The application contains:

* `Account` – abstract base class containing common account information and deposit behaviour
* `SavingsAccount` – implements a minimum balance rule
* `CurrentAccount` – supports an overdraft limit
* `Bank` – stores accounts and handles account lookup and money transfers
* `InsufficientBalanceException` – custom exception for failed withdrawals

The banking system allowed me to practice:

* Encapsulation
* Abstraction
* Inheritance
* Polymorphism
* Method overriding
* Exception handling
* `HashMap`
* Interaction between multiple objects

### Testing

I have also written automated tests for the Java implementations.

The tests include both positive and negative scenarios, such as:

* Valid deposits and withdrawals
* Invalid amounts
* Insufficient balance
* Adding accounts
* Duplicate accounts
* Invalid account input
* Money transfers between accounts
* Expected exceptions

The repository currently contains tests using **JUnit 5 and TestNG**.

## Project Structure

```text
core-java-exercises/
│
├── src/
│   ├── main/java/com/corejava/
│   │   ├── arrays/
│   │   ├── datastructures/
│   │   ├── oop/
│   │   └── strings/
│   │
│   └── test/java/com/corejava/
│       ├── arrays/
│       ├── datastructures/
│       ├── oop/
│       └── strings/
│
├── pom.xml
└── README.md
```

The test packages follow the same structure as the production code to make the corresponding tests easy to find.

## Technology

* Java
* Maven
* JUnit 5
* TestNG
* AssertJ
* Maven Surefire
* Git / GitHub

## Running the Tests

From the project root:

```bash
mvn test
```

To clean the generated Maven files:

```bash
mvn clean
```

To clean, build and run the tests:

```bash
mvn clean package
```

## Learning Focus

The main focus of this repository is to strengthen my Core Java programming skills through hands-on practice.

It covers:

* Problem solving with Strings and Arrays
* Working with Java Collections
* Exception handling
* Object-oriented programming
* Writing automated tests
* Using Maven to build and test a Java project
* Structuring Java code using standard Maven project conventions
