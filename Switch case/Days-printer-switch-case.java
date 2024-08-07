/* 
Question: Write a program that takes an integer (1-7) as input and outputs the corresponding day of the week. 
If the input is outside this range, the program should display "Invalid input."

Instructions:
1. Prompt the user to enter a number corresponding to a day of the week (1 for Monday, 2 for Tuesday, etc.).
2. Use a switch statement to determine and print the correct day based on the input.
3. If the input is not within the range of 1-7, display "Invalid input."
*/

import java.util.Scanner;

class Index {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for day: ");
        int ch = sc.nextInt();
        
        switch(ch) {
            case 1: 
                System.out.println("Monday");
                break;
            case 2:     
                System.out.println("Tuesday");
                break;
            case 3: 
                System.out.println("Wednesday");
                break;
            case 4: 
                System.out.println("Thursday");
                break;
            case 5: 
                System.out.println("Friday");
                break;
            case 6: 
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:    
                System.out.println("Invalid input");
        }
    }
}
