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
