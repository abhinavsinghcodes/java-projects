/*
 * Question:
 * Write a program in Java to check if a number entered by the user is a palindrome.
 * 
 * Instructions:
 * - The program should prompt the user to enter an integer.
 * - Reverse the digits of the entered number.
 * - Compare the reversed number with the original number.
 * - Print "Number is palindrome" if they are the same; otherwise, print "Number is not palindrome."
 */

import java.util.Scanner; // Import the Scanner class to take user input

class index { // The class name should match the filename or be public
    public static void main(String args[]) { // Main method, entry point of the program
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read input

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int num = sc.nextInt(); // Read the integer input from the user

        int rev = 0, temp = num; // Initialize variables to store the reversed number and a temporary copy of the number

        // Loop to reverse the digits of the number
        while(temp > 0) {
            int digit = temp % 10; // Get the last digit of the number
            rev = rev * 10 + digit; // Append the digit to the reversed number
            temp /= 10; // Remove the last digit from the number
        }

        // Check if the reversed number is equal to the original number
        if(rev == num)
            System.out.println("Number is palindrome"); // Print if the number is a palindrome
        else
            System.out.println("Number is not palindrome"); // Print if the number is not a palindrome
        
        sc.close(); // Close the Scanner to prevent resource leaks
    }
}
