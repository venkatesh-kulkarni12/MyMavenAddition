package com.example;

import java.util.Random;

public class App {
    // Method to add two numbers
    public static int addNumbers(int num1, int num2) {
        return num1 + num2;
    }

    // Main method
    public static void main(String[] args) {
        // Create a Random object to generate random numbers
        Random random = new Random();

        // Generate two random integers between 1 and 100
        int num1 = random.nextInt(100) + 1;  // Random number between 1 and 100
        int num2 = random.nextInt(100) + 1;  // Random number between 1 and 100

        // Calculate and display the result
        int sum = addNumbers(num1, num2);
        System.out.println("The first random number is: " + num1);
        System.out.println("The second random number is: " + num2);
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}

