package stringAndArrayProblems;
/**
 * Given an image represented by an NxN matrix, where each 
 * pixel in the image is 4 bytes, write a method to rotate 
 * the image by 90 degrees Can you do this in place?
 * 
 * Using integer as a replacement for 4 bytes since each 
 * integer is equal to 4 bytes. 
 * @author Andy
 *
 */
public class P1_6 {

	/**
	 * Assumption that we want to rotate it clockwise by 90 degrees. 
	 * The problem is very complex to tackle in one shot so it is wise
	 * to find a solution to the problem using solutions to simpler problems
	 * Simple methods on matrix that dont change any values are transposition,
	 * reverse columns/rows. 
	 * By combining both solutions with a few tests, it turns out transposing a 
	 * matrix and then reversing its row rotates the matrix clockwise.
	 * 
	 * Efficiency : O(n^2)
	 * @param matrix
	 */
	private static void run(int [][]matrix)
	{
		transpose(matrix);
		reverseRows(matrix);
	}
	
	/**
	 * Method to transpose a matrix
	 * @param matrix
	 */
	private static void transpose(int [][]matrix)
	{
		int temp;
		for (int i=0; i<matrix.length-1; i++)
		{
			for (int j=1+i; j<matrix[0].length; j++)
			{
				temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
	}
	
	/**
	 * Method to reverse each of the rows in an NxN matrix
	 * @param matrix
	 */
	private static void reverseRows(int [][]matrix)
	{
		int temp;
		for (int i=0; i<matrix.length; i++)
		{
			for (int j=0; j<matrix[0].length/2; j++)
			{
				temp = matrix[i][j];
				matrix[i][j] = matrix[i][matrix[0].length-1-j];
				matrix[i][matrix[0].length-1-j] = temp;
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
		int a[][] = {{1,2,3},
				{4,5,6},
				{7,8,9}};
		printMatrix(a);
		run(a);
		printMatrix(a);
		run(a);
		printMatrix(a);
		run(a);
		printMatrix(a);
		run(a);
		printMatrix(a);
		
		int b[][] = {{}};
		printMatrix(b);
		run(b);
		printMatrix(b);
	}
}
