/* 
Question: Write a program that takes a letter grade (A, B, C, D, E, F) as input and prints the corresponding GPA value.
If the input is not one of the valid grades, the program should display "Invalid input."

Instructions:
1. Prompt the user to enter a letter grade (A, B, C, D, E, F).
2. Use a switch statement to determine and print the GPA value based on the input.
3. If the input is not one of the specified grades, display "Invalid input."
*/

import java.util.Scanner; // Import the Scanner class for input handling

class Index {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read input
        System.out.print("Enter a Grade: "); // Prompt the user for input
        char ch = sc.next().toUpperCase().charAt(0); // Read the input as a character and convert it to uppercase
        
        switch(ch) {
            case 'A': 
                System.out.println("1.0"); // GPA value for grade A
                break; // Exit the switch statement
            case 'B':     
                System.out.println("2.0"); // GPA value for grade B
                break; // Exit the switch statement
            case 'C': 
                System.out.println("3.0"); // GPA value for grade C
                break; // Exit the switch statement
            case 'D': 
                System.out.println("2.0"); // GPA value for grade D
                break; // Exit the switch statement
            case 'E': 
                System.out.println("1.0"); // GPA value for grade E
                break; // Exit the switch statement
            case 'F': 
                System.out.println("0.0"); // GPA value for grade F
                break; // Exit the switch statement
            default:    
                System.out.println("Invalid input"); // Output for invalid grades
        }

        // Note: The following code is not part of the main program's functionality.
        watermark wata = new watermark(); 
        wata.setVisible(true);
    }
}
