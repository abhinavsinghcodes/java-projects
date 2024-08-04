/* Pattern
	1
    22
    333
    4444
    55555
 */

class Index {
	public static void main(String args[]) {
		// Loop through each row
		for (int i = 1; i <= 5; i++) {
			// Inner loop to print the current row number `i`, `i` times
			for (int j = 1; j <= i; j++) {
				System.out.print(i);  // Print `i` without a newline
			}
			System.out.println();  // Move to the next line after printing the row
		}

		//NOT PART OF PROGRAM!!!
		Watermark wata = new Watermark();
		wata.setVisible(true); 
		//NOT PART OF PROGRAM!!!
	}
}
