package Moderate;

/**
 * Write a function to swap a number in place(that is, without temporary variables).
 * @author Andy
 *
 */
public class P17_1 {

	/**
	 * Complete everything in main argument since passing integer as 
	 * an argument doesn't affect the value in main method. We would
	 * make it as a function in C since we can work with addresses though
	 * 
	 * Method is to add them to each on one, then subtract one another in a
	 * specific order
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		
		b += a;
		// b is the sum of both
		// a is sum - a;
		a = b - a;
		// b is sum - b;
		b = b - a;
		
		System.out.println(a);
		System.out.println(b);
	}
}
