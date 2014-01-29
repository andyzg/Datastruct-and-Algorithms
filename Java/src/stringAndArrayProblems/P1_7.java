package stringAndArrayProblems;

import java.util.ArrayList;
import java.util.List;

/**
 * Write an algorithm such that if an element in an MxN matrix 
 * is 0, its entire row and column is set to 0 
 * @author Andy
 *
 */
public class P1_7 {

	/**
	 * First potential problem is that if we immediately zero out a 
	 * row/column, it will end of clearing all of the rows/columns so 
	 *  we need to keep track of the rows/columns to delete with a list.
	 *  
	 *  Afterwards, it's fairly simple to just delete all of the rows/columns
	 * 
	 * Efficiency : O(n^2) 
	 * @param matrix
	 */
	private static void run(int[][] matrix)
	{
		List<Integer> row = new ArrayList<Integer>();
		List<Integer> column = new ArrayList<Integer>();
		
		for (int i=0; i<matrix.length; i++)
		{
			for (int j=0; j<matrix[0].length; j++)
			{
				if (matrix[i][j] == 0)
				{
					row.add(i);
					column.add(j);
				}
			}
		}
		
		for (int i:row)
		{
			for (int j=0; j<matrix[0].length; j++)
			{
				matrix[i][j]=0;
			}
		}
		
		for (int i:column)
		{
			for (int j=0; j<matrix.length; j++)
			{
				matrix[j][i] = 0;
			}
		}
	}
	
	/**
	 * Method to print the NxN matrix
	 * @param matrix
	 */
	private static void printMatrix(int [][]matrix)
	{
		for (int i=0; i<matrix.length; i++)
		{
			for (int j=0; j<matrix[0].length; j++)
			{
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		int [][]a = {{1,2,3},
				{0,0,6},
				{7,8,9},
				{10,11,12}};
		
		printMatrix(a);
		run(a);
		printMatrix(a);
	}
}
