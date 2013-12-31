/**
 * Implementation of Quick Sort
 * @author Andy
 *
 */
public class QuickSort {

	public static void main(String[] args)
	{
		int list[] = {3,1,3,2,2,5,8,9,10};
		
		printArray(list);
	
		quickSort(list, 0, list.length-1);
		
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
	
	private static void quickSort(int list[], int left, int right)
	{
		int pivotIndex;
		
		if (left < right)
		{
			pivotIndex = partition(list, left, right);
			
			quickSort(list, left, pivotIndex-1);
			quickSort(list, pivotIndex+1, right);
		}
	}
	
	private static int partition(int list[], int left, int right)
	{
		// Pivot is at center
		int pivotIndex = (left + right) / 2;
		int pivot = list[pivotIndex];
		int store = left, temp;
		
		// Swap pivot with right end
		temp = list[pivotIndex];
		list[pivotIndex] = list[right];
		list[right] = temp;
		
		// Split the array into larger and smaller relative to pivot
		for (int i=left; i < right; i++)
		{
			if (list[i] <= pivot)
			{
				temp = list[store];
				list[store] = list[i];
				list[i] = temp;
				store++;
			}
		}
		
		// Move the pivot between array of larger and smaller
		temp = list[store];
		list[store] = list[right];
		list[right] = temp;
		
		return store;
	}
}
