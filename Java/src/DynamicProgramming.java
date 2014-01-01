
public class DynamicProgramming {

	private static int[] fibNum = new int[50];
	private static int Fibonacci(int a)
	{
		if (a <= 1)
		{
			return a;
		}
		else
		{
			int f = fibNum[a];
			if (f == 0)
			{
				f = Fibonacci(a-1) + Fibonacci(a-2);
				fibNum[a] = f;
			}
			return f;
		}
	}
	
	public static void main(String[] args)
	{
		for (int i=0; i<45; i++)
			System.out.println(Fibonacci(i));
	}
}
