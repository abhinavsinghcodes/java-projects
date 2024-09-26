import java.util.Scanner;

class ext {
    public static void main(String Args[]) {
        Scanner sc = new Scanner(System.in); // Creating a Scanner object to take input from the user
        
        int arr[] = new int[20]; // Initializing an array to store 20 integers
        int sum = 0; // Variable to store the sum of the numbers
        double avg;  // Variable to store the average of the numbers

        // Loop through 20 times to get input and calculate sum
        for(int i = 0; i < 20; i++) {
            System.out.print("Enter " + (i + 1) + "th number: ");
            arr[i] = sc.nextInt(); // Taking input from the user and storing it in the array
            sum += arr[i]; // Adding the current input to the sum
        }

        // Calculating the average (cast sum to double for accurate division)
        avg = (double) sum / 20;

        // Output the sum and average
        System.out.println("Sum: " + sum + "\nAverage: " + avg);

        // Closing the scanner to avoid memory leak
        sc.close();
    }
}
