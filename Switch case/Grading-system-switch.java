/* 
Question: Write a program that takes a single character grade ('A', 'B', 'C', 'D', 'E', 'F') as input and displays the corresponding grade description. 
If the input is not one of these characters, the program should display "Invalid input."

Instructions:
1. Prompt the user to enter a single character grade.
2. Use a switch statement to determine and print the grade description based on the input.
3. If the input is not one of the specified grades, display "Invalid input."
*/

import java.util.Scanner; // Import the Scanner class for input handling

class Index {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read input
        System.out.print("Enter a grade (A, B, C, D, E, F): "); // Prompt the user for input
        char ch = sc.next().toUpperCase().charAt(0); // Read the input, convert to uppercase, and get the first character
        
        switch(ch) {
            case 'A': 
                System.out.println("Above average"); // Output for grade A
                break; // Exit the switch statement
            case 'B':     
                System.out.println("Better"); // Output for grade B
                break; // Exit the switch statement
            case 'C': 
                System.out.println("Can do better"); // Output for grade C
                break; // Exit the switch statement
            case 'D': 
                System.out.println("Don't ever try again"); // Output for grade D
                break; // Exit the switch statement
            case 'E': 
                System.out.println("Eggplant better than you"); // Output for grade E
                break; // Exit the switch statement
            case 'F': 
                System.out.println("Failure"); // Output for grade F
                break; // Exit the switch statement
            default:    
                System.out.println("Invalid input"); // Output for invalid grades
        }
        //NOT PART OF PROGRAM
        watermark wata = new watermark();
        wata.setVisible(true);
        //NOT PART OF PROGRAM
    }
}
