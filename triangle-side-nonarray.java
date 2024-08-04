// WAP in java to take input three sides of a triangle which type of triangle (non-array)
//imports
import java.util.Scanner;
//class naming
class index {
	public static void main(String args[]) {
		//create scanner object
		Scanner sc = new Scanner(System.in);
		//Taking inputs 
		System.out.print("Enter 1st side: ");
		double side1 = sc.nextDouble();
		System.out.print("Enter 2nd side: ");
		double side2 = sc.nextDouble();
		System.out.print("Enter 3rd Side: ");
		double side3 = sc.nextDouble();
		//Conditions 
		if(side1 == side2 && side2 == side3) {
			System.out.println("Triangle is an equilateral triangle");
		}
		else if(side1 == side2 || side2 == side3 || side3 == side1) {
			System.out.println("Triangle is a Isoceless triangle");
		}
		else {
			System.out.println("Triangle is a Scalene triangle");
		}
    sc.close();

		        // NOT PART OF PROGRAM - but this adds a dope watermark 🖋
        watermark wata = new watermark();
        wata.setVisible(true);
        // NOT PART OF PROGRAM - watermark ends here
	}
}
