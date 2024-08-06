/*
 * Question:
 * Write a program in Java to sort an array of integers entered by the user.
 * 
 * Instructions:
 * - The program should prompt the user to enter the number of elements in the array.
 * - The program should then prompt the user to enter each element of the array.
 * - After all elements have been entered, sort the array in ascending order.
 * - Print the sorted array.
 */

import java.util.Arrays; // Import the Arrays class to use Arrays.sort()
import java.util.Scanner; // Import the Scanner class to take user input

class index {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read input
        
        // Prompt the user to enter the number of elements
        System.out.print("Enter number of elements: ");
        int elements = sc.nextInt();
        
        // Create an array to hold the elements
        int[] arr = new int[elements];
        
        // Loop to input each element into the array
        for(int i = 0; i < elements; i++) {
            System.out.print("Enter " + (i + 1) + "th Element: ");
            arr[i] = sc.nextInt(); // Read each element from the user
        }
        
        // Sort the array in ascending order
        Arrays.sort(arr);
        
        // Print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(arr));
        
        //NOT PART OF PROGRAM!!!
        watermark wata = new watermark();
        wata.setVisible(true);
        //NOT PART OF PROGRAM!!!
    }
}
