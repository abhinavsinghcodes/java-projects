/* Print this pattern 
	1
	12
	123
	1234
	12345
	123456....n
*/

import java.util.Scanner;
class index {
	public static void main(String args[]) {
		//Scanner class
		Scanner sc = new Scanner(System.in);
		//input n
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		//outer loop
		for(int i = 1; i<=n; i++) {
		    //inner loop
			for(int j = 1; j<=i; j++) {
			//Print j first
				System.out.print(j);
			}
			//next line
			System.out.println();
		}
		        // NOT PART OF PROGRAM - but this adds a dope watermark 🖋
        watermark wata = new watermark();
        wata.setVisible(true);
        // NOT PART OF PROGRAM - watermark ends here
	} 
}
