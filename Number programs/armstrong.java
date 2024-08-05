// Program to check if a number is an Armstrong number
// Example: 153 = 1^3 + 5^3 + 3^3 = 153

import java.util.Scanner;

class Index {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        // Initialize sum to hold the sum of cubes of digits
        int sum = 0;
        int temp = num; // Use a temporary variable to preserve the original number

        // Calculate the sum of cubes of digits
        while (temp > 0) {
            int digit = temp % 10; // Extract the last digit
            sum += digit * digit * digit; // Add the cube of the digit to sum
            temp /= 10; // Remove the last digit
        }

        // Check if the sum of cubes equals the original number
        if (sum == num) {
            System.out.println("The number is an Armstrong number");
        } else {
            System.out.println("The number is not an Armstrong number");
        }
        
        //NOT INCLUDED IN PROGRAM
        watermark wata = new watermark();
        wata.setVisible(true);
        //NOT INCLUDED IN PROGRAM
    }
}
