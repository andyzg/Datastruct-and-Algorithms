package stringAndArrayProblems;

import java.util.Hashtable;

public class P1_4 {

	private static boolean run(String a, String b)
	{
		if (a.length() != b.length())
			return false;
		
		Hashtable<Character, Integer> ht = new Hashtable<Character, Integer>();
		
		for (int i=0; i<a.length(); i++)
		{
			if (ht.containsKey(a.charAt(i)))
			{
				
			}
		}
	}
}
