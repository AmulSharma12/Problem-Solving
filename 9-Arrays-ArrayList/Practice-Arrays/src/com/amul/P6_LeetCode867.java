// https://leetcode.com/problems/transpose-matrix/submissions/

import java.util.Scanner;

public class P6_LeetCode867
{
	public static void main(String[] args)
	{
		int[][] matrix = {
			{2,4,-1},
			{-10,5,11},
			{18, -7, -6}
		};

		int[][] result = transpose(matrix);
		System.out.println(Arrays.toString(result));
	}


	public static int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] result = new int[n][m];
        
        
        for(int row = 0; row<m; row++)
        {
            for(int col = 0; col<n; col++)
            {
                result[col][row] = matrix[row][col];
            }
        }
        
        
        
        //return the result array
        return result;
    }
}