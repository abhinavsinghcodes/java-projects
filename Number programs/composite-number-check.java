/*
This program checks whether a given number is composite. 
A composite number is a positive integer greater than 1 that has at least one divisor other than 1 and itself.
If the number is composite, the program will display "Number is composite"; otherwise, it will display "Number is not composite."
*/

import java.util.Scanner;

class Index {  // Class name should start with an uppercase letter
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int counter = 0;

        // Loop to check how many divisors the number has
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) 
                counter++;  // Increment counter if 'i' is a divisor of 'num'
        }

        // A composite number should have more than 2 divisors (1 and the number itself)
        if (counter > 2)   
            System.out.println("Number is composite");
        else
            System.out.println("Number is not composite");
    }
}
