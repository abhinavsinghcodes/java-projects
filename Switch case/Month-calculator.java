/* 
Question: Write a program that takes a number between 1 and 12 as input and prints the corresponding month name. 
If the number is outside this range, the program should display "Invalid input."

Instructions:
1. Prompt the user to enter a number corresponding to a month (1 for January, 2 for February, etc.).
2. Use a switch statement to determine and print the month name based on the input.
3. If the input is not within the range of 1-12, display "Invalid input."
*/

import java.util.Scanner; // Import the Scanner class for input handling

class Index {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read input
        System.out.print("Enter a number for day: "); // Prompt the user for input
        int ch = sc.nextInt(); // Read the input as an integer
        
        switch(ch) {
            case 1: 
                System.out.println("January"); // Output for month 1
                break; // Exit the switch statement
            case 2:     
                System.out.println("February"); // Output for month 2
                break; // Exit the switch statement
            case 3: 
                System.out.println("March"); // Output for month 3
                break; // Exit the switch statement
            case 4: 
                System.out.println("April"); // Output for month 4
                break; // Exit the switch statement
            case 5: 
                System.out.println("May"); // Output for month 5
                break; // Exit the switch statement
            case 6: 
                System.out.println("June"); // Output for month 6
                break; // Exit the switch statement
            case 7: 
                System.out.println("July"); // Output for month 7
                break; // Exit the switch statement
            case 8: 
                System.out.println("August"); // Output for month 8
                break; // Exit the switch statement
            case 9: 
                System.out.println("September"); // Output for month 9
                break; // Exit the switch statement
            case 10: 
                System.out.println("October"); // Output for month 10
                break; // Exit the switch statement
            case 11: 
                System.out.println("November"); // Output for month 11
                break; // Exit the switch statement
            case 12: 
                System.out.println("December"); // Output for month 12
                break; // Exit the switch statement
            default:    
                System.out.println("Invalid input"); // Output for invalid numbers
        }

        // Note: The following code is not part of the main program's functionality.
        watermark wata = new watermark(); 
        wata.setVisible(true);
    }
}
