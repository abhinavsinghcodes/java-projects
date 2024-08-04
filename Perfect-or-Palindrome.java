// Write a program in java to accept a number and check if its a palindrome or perfect number
// palindrome: whose reverse is same as initial
// ex: 101 
// perfect: sum of factor is equal to itself
// ex: 6 = 1 + 2 + 3 = 6
import java.util.Scanner;

class Index {
    public static void main(String args[]) {
        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        // Palindrome check
        int temp = n;
        int rev = 0, r;
        while (temp != 0) {
            r = temp % 10;
            rev = rev * 10 + r;
            temp = temp / 10;
        }

        // Perfect number check
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        // Output results
        if (n == rev && sum == n) {
            System.out.println("Number is both a palindrome and a perfect number.");
        } else if (n == rev) {
            System.out.println("Number is a palindrome but not a perfect number.");
        } else if (sum == n) {
            System.out.println("Number is a perfect number but not a palindrome.");
        } else {
            System.out.println("Number is neither a palindrome nor a perfect number.");
        }

        sc.close();
    }
}
