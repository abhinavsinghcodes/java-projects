/*
 * Question:
 * Write a program in Java to calculate the factorial of a number entered by the user.
 * 
 * Instructions:
 * - The program should prompt the user to enter an integer.
 * - Calculate the factorial of the entered number using a loop.
 * - Print the factorial of the number.
 */

 import java.util.Scanner; // Import the Scanner class to take user input

 class index { // The class name should match the filename or be public
     public static void main(String args[]) { // Main method, entry point of the program
         Scanner sc = new Scanner(System.in); // Create a Scanner object to read input
 
         // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int num = sc.nextInt(); // Read the integer input from the user
 
        int factorial = 1; // Initialize the variable to store the factorial
 
         // Loop to calculate the factorial of the number
        while(num != 0) {
             factorial = factorial * num; // Multiply factorial by the current number
             num--; // Decrease the number
        }

         // Print the calculated factorial
        System.out.println("Factorial is "+factorial);
 
         sc.close(); // Close the Scanner to prevent resource leaks

         //NOT PART OF PROGRAM!!!
        watermark wata = new watermark();
        wata.setVisible(true);
         //NOT PART OF PROGRAM!!!
        }
}
