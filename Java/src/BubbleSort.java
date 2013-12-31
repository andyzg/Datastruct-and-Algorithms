/**
 * Implementation of Bubble Sort
 * @author Andy
 *
 */
public class BubbleSort {

	public static void main(String args[])
	{
		int list[] = {3,1,9,7,5,2,10};
		
		// Before sort
		printArray(list);
		
		bubbleSort(list);
		
		// After sort
		printArray(list);
	}
		
	private static void printArray(int []list)
	{
		for (int i=0; i<list.length; i++)
		{
			System.out.print(list[i] + "\t");
		}
		System.out.println();
		return;
	}

	private static void bubbleSort(int[] list)
	{
		int temp;
		
		for (int i=0; i<list.length-1 ; i++)
		{
			for (int j=0; j<list.length-1-i; j++)
			{
				if (list[j] > list[j+1])
				{
					temp = list[j];
					list[j] = list[j+1];
					list[j+1] = temp;
				}
			}
		}
	}
}
