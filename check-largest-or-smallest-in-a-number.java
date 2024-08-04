// Program to input a number and find the highest and lowest digits

import java.util.Scanner;

class Index {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int x = num; // Copy of the number for processing
        int highest = 0; // Initialize highest digit to 0
        int lowest = 9; // Initialize lowest digit to 9

        // Extract digits and determine the highest and lowest
        while (x != 0) {
            int digit = x % 10; // Extract the last digit
            x /= 10; // Remove the last digit
            
            // Update highest and lowest digits
            if (digit > highest) {
                highest = digit;
            }
            if (digit < lowest) {
                lowest = digit;
            }
        }

        // Output the results
        System.out.println("Highest digit: " + highest);
        System.out.println("Lowest digit: " + lowest);

      // NOT PART OF PROGRAM DONT COPY!
        watermark wata = new watermark();
        wata.setVisible(true);
      // NOT PART OF PROGRAM DONT COPY!
    }
}
