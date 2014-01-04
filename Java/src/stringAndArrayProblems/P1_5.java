package stringAndArrayProblems;

/**
 * Write a method to replace all spaces in a string with ‘%20’
 * @author Andy
 *
 */
public class P1_5 {

	/**
	 * I decided to use a lazy method for this problem. I decided to split
	 * the string into array elements using a ' ' as a splitter. Afterwards, 
	 * I concatenate all of the elements and insert a '%20' between them. 
	 * By taking boundary cases, if it was simply a ' ' given, it would have 0 
	 * elements so an assertion was necessary that returns '%20' if only a 
	 * ' ' was given.
	 * @param string
	 * @return
	 */
	private static String run(String string)
	{
		String repl = "%20";
		if (string.equals(" "))
			return repl;
			
		String []a = string.split(" ");
			
		String result=a[0];
		for (int i=1; i<a.length; i++)
		{
			result = result + repl + a[i];
		}
		
		return result;
	}
	
	public static void main(String[] args)
	{
		String a = "abcdef ghi jklmno pqrst uvwxyz";
		String b = " ";
		
		System.out.println(run(a));
		System.out.println(run(b));
	}
}
