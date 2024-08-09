/* Pattern
    1
    23
    456
    78910
 */

class index {
    public static void main(String[] args) {
        int num = 1; // Starting number
        
        // Outer loop to control the number of rows (4 rows)
        for (int i = 1; i <= 4; i++) {
            // Inner loop to control the numbers printed in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(num); // Print the current number
                num++; // Increment the number for the next print
            }
            System.out.println(); // Move to the next line after each row
        }
		//NOT INCLUDED IN PROGRAM!!
		watermark wata = new watermark();
		wata.setVisible(true);
		//NOT INCLUDED IN PROGRAM!!
    }
}
