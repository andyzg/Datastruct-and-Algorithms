package Moderate;

/**
 * Write an algorithm which computes the number of trailing
 * zeros in n factorial
 * @author Andy
 *
 */
public class P17_3 {

	/**
	 * A trailing zero depends on the amount of times a number is 
	 * multiplied by ten. As a result, since ten is a product of 
	 * prime numbers 2 and 5, we must find the amount of total 2's and 
	 * 5's in each of n to 1.
	 * 
	 * Assume that if n == 0, then 0 is considered as trailing zero and 
	 * return 1
	 * @param n
	 * @return
	 */
	private static int trailingZeros(int n) {
		
		if ( n == 0 ) {
			return 1;
		}
		
		// initialize both counters
		int twoCount = 0;
		int fiveCount = 0;
		
		for (int i=2; i<=n; i++) {
			int temp = i;
			// Extract all 2s from i
			while (temp%2 == 0) {
				twoCount++;
				temp /= 2;
			}
			temp = i;
			// Extract all 5s from i
			while (temp%5 == 0) {
				fiveCount++;
				temp /= 5;
			}
		}
		
		// Return the minimum of the two
		return twoCount > fiveCount ? fiveCount : twoCount;
	}
	
	public static void main(String[] args) {
		System.out.println(trailingZeros(0));
	}
}
