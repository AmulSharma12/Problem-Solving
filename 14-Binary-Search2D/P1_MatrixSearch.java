import java.util.Scanner;
import java.util.Arrays;

//you have given a matrix and you have to search for a target Linear Search
public class P1_MatrixSearch
{
	public static void main(String[] args)
	{
		int[][] arr = {
			{10, 20, 30, 40},
			{15, 25, 35, 45},
			{28, 29, 37, 49},
			{33, 34, 38, 50}
		};

		int target = 37;
		System.out.println(Arrays.toString(linearSearch(arr,target)));
	}

	//search function
	static int[] linearSearch(int[][] matrix, int target)
	{
		for(int row = 0; row<matrix.length; row++)
		{
			for(int col = 0; col<matrix.length; col++)
			{
				if(matrix[row][col] == target)
					return new int[]{row,col};
			}
		}
		return new int[]{-1, -1};
	}
}