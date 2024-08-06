/*
 * Question:
 * Write a program in Java to accept a number from the user and print the reverse of that number.
 * 
 * Instructions:
 * - The program should prompt the user to enter an integer.
 * - Reverse the digits of the entered number.
 * - Display the reversed number to the user.
 */

import java.util.Scanner; // Import the Scanner class to take user input

class index { // The class name should match the filename or be public
    public static void main(String args[]) { // Main method, entry point of the program
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read input

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int num = sc.nextInt(); // Read the integer input from the user

        int rev = 0; // Initialize the variable to store the reversed number
        int temp = num; // Use a temporary variable to manipulate the number

        // Loop to reverse the digits of the number
        while(temp > 0) {
            int digit = temp % 10; // Get the last digit of the number
            rev = rev * 10 + digit; // Append the digit to the reversed number
            temp /= 10; // Remove the last digit from the number
        }

        // Print the reversed number
        System.out.println("Reversed digit: " + rev);
        
        sc.close(); // Close the Scanner to prevent resource leaks

        //NOT PART OF PROGRAM!!!
        watermark wata = new watermark();
        wata.setVisible(true);
        //NOT PART OF PROGRAM!!!
    }
}
