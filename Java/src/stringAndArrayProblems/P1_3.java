package stringAndArrayProblems;
/**
 * Design an algorithm and write code to remove the duplicate 
 * characters in a string without using any additional buffer 
 * NOTE: One or two additional variables are fine 
 * An extra copy of the array is not 
 * @author Andy
 *
 */
public class P1_3 {

	/**
	 * Since there is a memory limitation, this often has a negative impact
	 * on the time efficiency. 
	 * This algorithm reuses the same string by concatenating unique characters
	 * to the end of the original string. Afterwards, it returns the substring
	 * starting at the end of the original string.
	 * 
	 * Efficiency : O(n^2)
	 * @param a
	 * @return
	 */
	private static String run(String a)
	{
		int length = a.length();
		boolean found;
		
		for (int i=0; i<length; i++)
		{
			found = false;
			for (int j=length; j<a.length(); j++)
			{
				if (a.charAt(i) == a.charAt(j))
					found = true;
			}
			if (!found)
				a = a + a.charAt(i);
		}
		
		return a.substring(length);
	}
	
	public static void main(String args[])
	{
		String a = "aabbc";
		
		System.out.println(run(a));
	}
}
