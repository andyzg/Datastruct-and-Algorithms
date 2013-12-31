
public class MergeSort {

	public static void main(String[] args)
	{
		int list[] = {3,1,6,8,5,2,1,6,2};
		
		printArray(list);
		
		mergeSort(list);
		
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
	
	private static void mergeSort(int list[])
	{
		if (list.length <= 1)
			return;
		
		int a[] = new int[list.length/2];
		int b[] = new int[list.length - list.length/2];
		copy(list, a, 0, list.length/2-1);
		mergeSort(a);
		
		copy(list, b, list.length/2, list.length - 1);
		mergeSort(b);
		
		int i=0, j=0, k=0;
		int temp[] = new int[list.length];
		
		while (i<a.length && j<b.length)
		{
			if (a[i] > b[j])
				temp[k++] = b[j++];
			else
				temp[k++] = a[i++];
		}
		
		while (i<a.length)
			temp[k++] = a[i++];
		
		while (j<b.length)
			temp[k++] = b[j++];
		
		for (i=0; i<list.length; i++)
		{
			list[i] = temp[i];
		}
	}
	
	private static void copy(int list[],int result[], int start, int end)
	{
		int j=0;
		
		for (int i=start; i<=end; i++)
		{
			result[j++] = list[i];
		}
		return;
	}
}
