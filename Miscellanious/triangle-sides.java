// WAP in java to take input three sides of a triangle which type of triangle 
import java.util.Scanner;
class index {
	public static void main(String args[]) {
		//creating a double array 
		Scanner sc = new Scanner(System.in);
		double[] s = new double[3];
		for(int i = 0; i<3; i++) {
			System.out.print("Enter "+(i+1)+"th side: ");
			s[i] = sc.nextDouble();
		}
		if(s[0] == s[1] && s[1] == s[2]) {
			System.out.println("Equilateral triangle");
		}
		else if(s[0] == s[1] || s[1] == s[2] || s[0] == s[2]) {
			System.out.println("Iscocless triangle");
		}
		else {
			System.out.println("Scalene triangle");
		}
		sc.close();
	
		// NOT PART OF PROGRAM - but this adds a dope watermark 🖋
        watermark wata = new watermark();
        wata.setVisible(true);
        // NOT PART OF PROGRAM - watermark ends here
	}
}
