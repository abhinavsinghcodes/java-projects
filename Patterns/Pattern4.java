/* Pattern
	666666
	55555
	4444
	333
	22
	1
 */

class Index {
	public static void main(String args[]) {
		// Loop through each row, starting from 6 down to 1
		for (int i = 6; i >= 1; i--) {
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
