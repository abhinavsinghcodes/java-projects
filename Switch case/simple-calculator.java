/* 
Question: Create a simple calculator program with options to add, subtract, multiply, and divide. 
The program should prompt the user to choose an operation and then perform the selected calculation.
1. Implement methods for addition, subtraction, multiplication, and division.
2. Use a switch statement to handle user input and call the appropriate method.
3. Handle division by zero with an appropriate message and repeat the prompt if zero is entered.
4. Ensure that the user can exit the program.

Instructions:
1. Prompt the user to choose an operation from the menu.
2. Call the corresponding method based on the user's choice.
3. Ensure proper handling of division by zero.
4. Allow the user to exit the program by selecting the exit option.
*/

import java.util.Scanner; // Import the Scanner class for input handling

class Index {

    Scanner sc = new Scanner(System.in); // Create a Scanner object to read input

    // Method to add two numbers
    public double add() {
        System.out.print("Enter 1st number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter 2nd number: ");
        double num2 = sc.nextDouble();

        double sum = num1 + num2;
        System.out.println("Sum: " + sum);
        return sum;
    }

    // Method to subtract two numbers
    void subtract() {
        System.out.print("Enter 1st number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter 2nd number: ");
        double num2 = sc.nextDouble();

        double difference = num1 - num2;
        System.out.println("Difference: " + difference);
    }

    // Method to divide two numbers
    void divide() {
        System.out.print("Enter 1st number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter 2nd number: ");
        double num2 = sc.nextDouble();
        if (num2 == 0) {
            System.out.println("No zero please"); // Handle division by zero
            divide(); // Recursively call divide() to get a valid input
        } else {
            double quotient = num1 / num2; // Corrected from modulus to division
            System.out.println("Quotient: " + quotient);
        }
    }

    // Method to multiply two numbers
    void multiply() {
        System.out.print("Enter 1st number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter 2nd number: ");
        double num2 = sc.nextDouble();

        double product = num1 * num2;
        System.out.println("Product: " + product);
    }

    // Main method to display menu and handle user choices
    public static void main(String args[]) {
        Index calculator = new Index(); // Create an instance of Index class
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read user input
        
        while (true) {
            System.out.print("\tChoose\n1. Add\n2. Subtract\n3. Divide\n4. Multiply\n5. Exit\nChoose: ");
            int ch = sc.nextInt();
            
            switch(ch) {
                case 1:
                    calculator.add(); // Call add method
                    break;
                case 2:
                    calculator.subtract(); // Call subtract method
                    break;
                case 3:
                    calculator.divide(); // Call divide method
                    break;
                case 4:
                    calculator.multiply(); // Call multiply method
                    break;
                case 5: 
                    System.exit(0); // Exit the program
                    break;
                default:    
                    System.out.println("Invalid input"); // Handle invalid choices
            }
        }

        // Note: The following code is not part of the main program's functionality.
        watermark wata = new watermark(); 
        wata.setVisible(true);
    }
}
