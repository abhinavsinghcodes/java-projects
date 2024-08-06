/*
 * Question:
 * Write a program in Java to check if a number entered by the user is a prime number.
 * 
 * Instructions:
 * - The program should prompt the user to enter an integer.
 * - Check if the entered number is a prime number using a loop.
 * - Print whether the number is prime or not.
 */

import java.util.Scanner; // Import the Scanner class to take user input

class index { // The class name should match the filename or be public
    public static void main(String[] args) { // Main method, entry point of the program
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read input
        System.out.print("Enter a number: "); // Prompt user to enter a number
        int num = sc.nextInt(); // Read the integer input from the user
        
        int counter = 0; // Initialize counter to track number of divisors
        
        // Loop to count the number of divisors of the entered number
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) // Check if i is a divisor of num
                counter++; // Increment counter if it is a divisor
        }
        
        // Print whether the number is prime or not
        if (counter > 2)
            System.out.println("Not prime");
        else
            System.out.println("Prime");
        
        sc.close(); // Close the Scanner to prevent resource leaks
        
        //NOT PART OF PROGRAM!!!
        watermark wata = new watermark();
        wata.setVisible(true);
        //NOT PART OF PROGRAM!!!
    }
}
