// PROGRAM STARTS HERE
import java.util.Scanner;

class Index {
    public static void main(String args[]) {
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);
        System.out.print("\n1. Calculate S = 2 - 4 + 6 - 8... - 20\n2. Calculate S = x/2 + x/5 + x/8... x/20\n3. Exit\nEnter your choice: ");
        int ch = sc.nextInt();

        switch (ch) {
            case 1: 
                int sum = 0;
                // Loop to calculate S = 2 - 4 + 6 - 8... - 20
                for(int i = 2; i <= 20; i += 2) {
                    if(i % 4 == 2) {
                        sum += i; // Add even numbers at position 2, 6, 10, etc.
                    } else {
                        sum -= i; // Subtract even numbers at position 4, 8, 12, etc.
                    }
                }
                System.out.println("Sum: " + sum);
                break;

            case 2: 
                System.out.println("Enter value: ");
                int v = sc.nextInt();
                double sum1 = 0;
                // Loop to calculate S = x/2 + x/5 + x/8... x/20
                for(int j = 2; j <= 20; j += 3) {
                    sum1 += v / (double)j; // Add x divided by 2, 5, 8, etc.
                }
                System.out.println("Sum: " + sum1);
                break;

            case 3: 
                System.out.print("Exiting...");
                System.exit(0); // Exit the program
                break;

            default: 
                System.out.println("Error: Invalid choice"); // Handle invalid choices
        }

        //NOT PART OF PROGRAM
        watermark wata = new watermark();
        wata.setVisible(true);
        //NOT PART OF PROGRAM
    }
}
