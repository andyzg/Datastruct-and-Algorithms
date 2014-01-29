package stringAndArrayProblems;

/**
 * Assume you have a method isSubstring which checks if one word 
 * is a substring of another Given two strings, s1 and s2, write 
 * code to check if s2 is a rotation of s1 using only one call to 
 * isSubstring (i e , “waterbottle” is a rotation of “erbottlewat”) 
 * @author Andy
 *
 */
public class P1_8 {

	/**
	 * Part 1 of the question
	 * To solve this problem, try to find the start of the substring.
	 * After, check the characters after if they correspond to the rest of 
	 * the substring
	 * @param string
	 * @param sub
	 */
	private static boolean isSubstring(String string, String sub)
	{
		if (string.length() == 0 || sub.length() == 0)
			return false;
		
		char first = sub.charAt(0);
		boolean valid = true;
		
		for (int i=0; i<string.length() - sub.length()+1; i++)
		{
			valid = true;
			if (string.charAt(i) == first && i+sub.length() <= string.length())
			{
				for (int j=i; j<i+sub.length(); j++)
				{
					if (string.charAt(j) != sub.charAt(j-i))
					{
						valid = false;
						break;
					}
				}
				if (valid)
					return true;
			}
		}
		return false;
	}
	
	private static boolean isRotated(String s1, String s2)
	{
		if (s1.length() != s2.length() || s1.length() == 0 || s2.length() == 0)
			return false;
		
		s1 = s1 + s1;
		return isSubstring(s1, s2);
	}
	
	public static void main(String[] args)
	{
		String a = "andydddddd";
		String b = "ddddd";
		
		String c = "hello, my name is andy zhang";
		String d = "ame ";
		
		String e = " ";
		String f = " ";
		
		String g = "abcdefg";
		String h = "efgabcd";
		
		System.out.println(isSubstring(a,b));
		System.out.println(isSubstring(c,d));
		System.out.println(isSubstring(e,f));
		
		System.out.println(isRotated(g,h));
	}
}
