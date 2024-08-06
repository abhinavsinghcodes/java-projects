/*
 * Question:
 * Write a program in Java to calculate the sum of the digits of a number entered by the user.
 * 
 * Instructions:
 * - The program should prompt the user to enter an integer.
 * - Calculate the sum of the digits of the entered number using a loop.
 * - Print the sum of the digits.
 */

import java.util.Scanner; // Import the Scanner class to take user input

class index { // The class name should match the filename or be public
    public static void main(String[] args) { // Main method, entry point of the program
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read input
        System.out.print("Enter a number: "); // Prompt user to enter a number
        int num = sc.nextInt(); // Read the integer input from the user
        
        int temp = num, sum = 0; // Initialize variables to store the number and sum of digits
        
        // Loop to calculate the sum of the digits
        while (temp > 0) {
            int digit = temp % 10; // Get the last digit of the number
            sum += digit; // Add the digit to the sum
            temp /= 10; // Remove the last digit from the number
        }
        
        // Print the calculated sum of the digits
        System.out.println("Sum: " + sum);
        
        sc.close(); // Close the Scanner to prevent resource leaks
        
        //NOT PART OF PROGRAM!!!
        watermark wata = new watermark();
        wata.setVisible(true);
        //NOT PART OF PROGRAM!!!
    }
}
