/*
 * Question:
 * Write a program in Java to reverse a string entered by the user.
 * 
 * Instructions:
 * - The program should prompt the user to enter a string.
 * - Reverse the string using the StringBuilder class.
 * - Print the reversed string.
 */

import java.util.Scanner; // Import the Scanner class to take user input

class index { // The class name should match the filename or be public
    public static void main(String args[]) { // Main method, entry point of the program
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read input
        System.out.print("Enter a String: ");
        String str = sc.nextLine(); // Read the input string from the user
        StringBuilder stringbuilder = new StringBuilder(str); // Create a StringBuilder object with the input string
        System.out.println("Reversed: " + stringbuilder.reverse()); // Reverse the string and print it

        //NOT PART OF PROGRAM!!!
        watermark wata = new watermark();
        wata.setVisible(true);
        //NOT PART OF PROGRAM!!!
    }
}
