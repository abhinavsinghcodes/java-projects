/*
This program calculates the income tax for a male individual based on their age, gender, and taxable income. 
If the age is 65 or below and the gender is male, the program calculates the tax based on the taxable income.
Otherwise, it displays "Wrong category" if the criteria are not met.
*/

import java.util.Scanner;

class Index {  // Class name starts with an uppercase letter as per convention
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Getting the user's name
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        // Getting the user's age
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine();  // Consume the newline character

        // Getting the user's gender
        System.out.print("Enter gender: ");
        String gender = sc.nextLine();

        // Getting the user's taxable income
        System.out.print("Enter Taxable income: ");
        double ti = sc.nextDouble();
        double it = 0;

        // Check the age and gender criteria for tax calculation
        if (age <= 65 && gender.equalsIgnoreCase("male")) {
            if (ti < 160000) {
                it = 0;  // No tax for income below 160000
            } else if (ti > 160000 && ti <= 500000) {
                it = (ti - 160000) * 10 / 100.0;  // Tax for income between 160000 and 500000
            } else if (ti > 500000 && ti <= 800000) {
                it = ((ti - 500000) * 20 / 100.0) + 34000;  // Tax for income between 500000 and 800000
            } else {
                it = ((ti - 800000) * 30 / 100.0) + 94000;  // Tax for income above 800000
            }

            // Displaying the results
            System.out.println("Name: " + name + "\nAge: " + age + "\nGender: " + gender + 
                               "\nTaxable Income: " + ti + "\nIncome tax: " + it);
        } else {
            // If criteria are not met, display this message
            System.out.println("Wrong category");
        }

        //NOT PART OF PROGRAM
        watermark wata = new watermark();
        wata.setVisible(true);
        //NOT PART OF PROGRAM!
    }
}
