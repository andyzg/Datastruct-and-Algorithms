package stringAndArrayProblems;

import java.util.Arrays;
import java.util.Hashtable;

/**
 * Q: Implement an algorithm to determine if a string
 * has all unique characters. What if you can not use 
 * additional data structures?
 * @author Andy
 *
 */
public class P1_1 {

	/**
	 * Since a char is 1 byte which is equal to 2^8 bits, it has a 
	 * total of 256 possible values. By creating an array of 256, it 
	 * can keep track of all characters that already exist by setting the 
	 * index of the array as true depending on the ASCII value. 
	 * If the index is already set as true, then we know the character already
	 * appeared so therefore, it isn't unique. 
	 * If it reaches to the end without interruption, then all characters
	 * are unique` 
	 * 
	 * Efficiency : O(n) in speed
	 * @param string
	 * @return
	 */
	private static boolean run1(String string)
	{
		if (string.length() > 256)
			return false;
		
		boolean a[] = new boolean[256];
		Arrays.fill(a, false);
		
		for (int i=0; i<string.length(); i++)
		{
			if (!a[string.charAt(i)])
				a[string.charAt(i)] = true;
			else
				return false;
		}
		return true;
	}
	
	public static void main(String[] args)
	{
		String a = "asdf lcvpxcvwermlvpldp";
		String b = "asdio jdoiqmwlkd mlksaj oiasx ";
		String c = "";
		String d = "mm";
		String e = "          ";
		
		System.out.println(run1(a));
		System.out.println(run1(b));
		System.out.println(run1(c));
		System.out.println(run1(d));
		System.out.println(run1(e));
		
	}
}
