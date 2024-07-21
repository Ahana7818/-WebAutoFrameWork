package org.auto;

import java.util.Scanner;

public class FactorialAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for factorial calculation
        System.out.print("Enter a number to calculate factorial: ");
        int numFactorial = scanner.nextInt();

        try {
            // Calculate factorial
            long factorial = calculateFactorial(numFactorial);
            System.out.println("Factorial of " + numFactorial + ": " + factorial);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Input for number reversal
        System.out.print("Enter a number to reverse: ");
        int numToReverse = scanner.nextInt();

        // Reverse the number
        int reversedNumber = reverseNumber(numToReverse);
        System.out.println("Reversed number: " + reversedNumber);

        scanner.close(); // Close scanner to prevent resource leak
    }

    // Function to calculate factorial of a number
    public static long calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }

        long factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    // Function to reverse a number
    public static int reverseNumber(int num) {
        boolean isNegative = num < 0;
        num = Math.abs(num); // Work with positive number for reversal

        int reversed = 0;
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return isNegative ? -reversed : reversed;
    }
}
