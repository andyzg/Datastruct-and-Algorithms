package stringAndArrayProblems;
/**
 * Write code to reverse a C-Style String.(C-Style means that "abcd" 
 * is represented as five characters, including the null character)
 * 
 * For this implementation, we'll ignore that it includes the null
 * character
 * 
 * @author Andy
 *
 */
public class P1_2 {

	/**
	 * In order to reverse a string, all characters on the right 
	 * of the nth character need to be on the left and and vice versa
	 * for the left side. By repeatedly taking the first character and 
	 * placing it on the left side of a temporary string, we invert its 
	 * previous order. After placing it, we remove the first character of
	 * the original string by taking the substring starting from the 
	 * index 1.
	 * 
	 * Efficiency : O(n)
	 * @param a
	 * @return
	 */
	private static String run(String a)
	{
		String temp = "";
		int length = a.length();
		for (int i=0; i<length; i++) {
			temp = a.charAt(0) + temp;
			a = a.substring(1);
		}
		return temp;
	}
	
	public static void main(String[] args)
	{
		String a = "hablo";
		String b = "mamasita";
		String c = "Andy Zhang";
		
		System.out.println(run(a));
		System.out.println(run(b));
		System.out.println(run(c));
	}
}