package stringAndArrayProblems;

import java.util.Hashtable;
import java.util.Set;

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
				ht.put(a.charAt(i),ht.get(a.charAt(i))+1);
			}
			else
			{
				ht.put(a.charAt(i), 1);
			}
		}
		
		for (int i=0; i<b.length(); i++)
		{
			if (!ht.containsKey(b.charAt(i)))
				return false;
			else
				ht.put(b.charAt(i), ht.get(b.charAt(i))-1);
		}
		
		Set<Character> keys = ht.keySet();
		
		for (char x:keys)
		{
			if (ht.get(x) != 0)
			{
				System.out.println(x);
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args)
	{
		String a = "Andy Zhang";
		String b = "Kevin Li";
		String c = "ndAy ngZha";
		String d = "andandand";
		String e = "ndandanda";
		
		System.out.println(run(a,b));
		System.out.println(run(c,a));
		System.out.println(run(d,e));
	}
}
