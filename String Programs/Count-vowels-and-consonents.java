/*
Question: Write a Java program to count the number of vowels and consonants in a given string.
Instructions:
1. Read a string input from the user.
2. Convert the string to lowercase and remove any leading or trailing spaces.
3. Count vowels and consonants.
4. Print the counts of vowels and consonants.
*/

import java.util.Scanner;

class Index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter: ");
        String input = sc.nextLine().trim().toLowerCase();
        char[] arr = input.toCharArray();

        int vow = 0, cons = 0;
        for (char ch : arr) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                vow++;
            else if (Character.isLetter(ch)) // Count only letters as consonants
                cons++;
        }
        System.out.println("Vowels: " + vow);
        System.out.println("Consonants: " + cons);

        //NOT INCLUDED IN PROGRAM
        watermark wata = new watermark();
        wata.setVisible(true);
        //NOT INCLUDED IN PROGRAM
    }
}
