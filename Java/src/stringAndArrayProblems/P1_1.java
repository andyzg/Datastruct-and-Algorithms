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

	private static boolean run(String string)
	{
		Hashtable<Character, Boolean> ht = new Hashtable<Character, Boolean>();
		
		for (int i=0; i<string.length(); i++)
		{
			if (ht.containsKey(string.charAt(i)))
			{
				return false;
			}
			else
			{
				ht.put(string.charAt(i), true);
			}
		}
		return true;
	}
	
	private static boolean run1(String string)
	{
		if (string.length() > 128)
			return false;
		
		boolean a[] = new boolean[128];
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
		
		System.out.println(run(a));
		System.out.println(run(b));
		System.out.println(run(c));
		System.out.println(run(d));
		System.out.println(run(e));
		
		System.out.println();
		
		System.out.println(run1(a));
		System.out.println(run1(b));
		System.out.println(run1(c));
		System.out.println(run1(d));
		System.out.println(run1(e));
		
	}
}
