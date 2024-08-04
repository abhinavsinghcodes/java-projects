// Program to input a number and find the highest and lowest digits
import java.util.Scanner;

class index {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        // Input a number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        // Initialize variables to track the largest and smallest digits
        int x = num, l = 0, s = 9;
        
        // Loop through each digit
        while (x != 0) {
            int digit = x % 10;  // Get the last digit
            x = x / 10;          // Remove the last digit
            
            // If this digit is larger than the current largest, update largest
            if (digit > l)
                l = digit;
            
            // If this digit is smaller than the current smallest, update smallest
            if (digit < s)
                s = digit;
        }
        
        // Display the smallest and largest digits
        System.out.println("Smallest: " + s + "\nLargest: " + l);
        
        //NOT INCLUDED IN PROGRAM
        // Ignore this part, it's just extra code for later
        watermark wata = new watermark();
        wata.setVisible(true);
        //NOT INCLUDED IN PROGRAM
    }
}
