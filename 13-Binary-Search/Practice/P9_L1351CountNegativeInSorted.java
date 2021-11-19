// https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
// LeetCode 1351 -> Count Negative Numbers In Sorted Matrix

public class P9_L1351CountNegativeInSorted
{
	public static void main(String[] args)
	{
		int[][] arr ={
			{4,3,2,-1},
			{3,2,1,-1},
			{1,1,-1,-2},
			{-1,-1,-2,-3}
		};

		int result = countNegatives(arr);
		System.out.println(result);
	}

	//LeetCode1351 Solution ->  Brute Force Solution(Using count variable)
	 static public int countNegatives(int[][] grid)
	  {
        int count = 0;

        for(int i = 0; i<grid.length; i++)
        {
        	for(int j = 0; j<grid[i].length; j++)
        	{
        		//if element negative keeps on increment count variable
        			if(grid[i][j] < 0)
        				count ++;
        	}
        }
        return count;
    }
}