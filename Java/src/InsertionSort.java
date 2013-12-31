/**
 * Implementation of Insertion Sort
 * @author Andy
 *
 */
public class InsertionSort {

	public static void main(String[] args)
	{
		int[] list = {3,1,5,7,6,2,9,10};
		
		printArray(list);
		
		insertionSort(list);
		
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

	private static void insertionSort(int list[])
	{
		int j, temp;
		
		for (int i=1; i<list.length; i++)
		{
			j = i;
			
			while (j > 0 && list[j] < list[j-1])
			{
				temp = list[j];
				list[j] = list[j-1];
				list[j-1] = temp;
			}
		}
		return;
	}
}
