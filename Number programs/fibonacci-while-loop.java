/*
 * Question:
 * Write a program in Java to generate the Fibonacci sequence up to a specified number of terms.
 * 
 * Instructions:
 * - The program should prompt the user to enter the number of terms to display.
 * - Generate and print the Fibonacci sequence up to the specified number of terms.
 */

import java.util.Scanner; // Import the Scanner class to take user input

class index { // The class name should match the filename or be public
    public static void main(String[] args) { // Main method, entry point of the program
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read input
        System.out.print("Enter the number of terms: "); // Prompt user to enter the number of terms
        int num = sc.nextInt(); // Read the integer input from the user
        
        // Initialize the first three terms of the Fibonacci sequence
        int a = 0, b = 1, c = 1;
        
        // Loop to generate and print the Fibonacci sequence up to the specified number of terms
        while (num > 0) {
            System.out.print(a + " "); // Print the current term
            a = b; // Update a to the next term in the sequence
            b = c; // Update b to the next term in the sequence
            c = a + b; // Calculate the next term
            num--; // Decrease the number of terms remaining
        }
        
        sc.close(); // Close the Scanner to prevent resource leaks
        
        //NOT PART OF PROGRAM!!!
        watermark wata = new watermark();
        wata.setVisible(true);
        //NOT PART OF PROGRAM!!!
    }
}
