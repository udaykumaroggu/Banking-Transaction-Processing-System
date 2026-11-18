# Banking Transaction Processing System

## Project Overview

A Java-based console application that demonstrates multithreading and concurrent banking transactions using the Executor Framework. The system allows users to perform multiple withdrawal transactions safely while maintaining data consistency through synchronization.

## Technologies Used

- Java
- ExecutorService
- Multithreading
- Synchronization
- Exception Handling
- Object-Oriented Programming (OOP)

## Features

- User can enter the initial account balance.
- User can perform multiple transactions.
- Supports concurrent transaction processing.
- Prevents race conditions using synchronization.
- Handles insufficient balance through custom exceptions.
- Displays the final account balance after all transactions.
- Ensures thread-safe banking operations.

## Project Structure

- **main:** Application entry point
- **service:** Banking account operations
- **task:** Transaction processing tasks
- **exception:** Custom exception handling

## How to Run

1. Clone this repository.
2. Open the project in VS Code or Eclipse.
3. Make sure Java is installed and configured.
4. Compile and run the `BankingSystem.java` file.
5. Enter account balance and transaction details when prompted.

## Learning Outcomes

- Understanding Java Multithreading
- Working with ExecutorService
- Implementing Thread Synchronization
- Handling Concurrent Processing
- Creating Custom Exceptions
- Managing Resources Efficiently

## Author

Uday Kumar
