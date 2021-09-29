import java.util.Scanner;

public class P9_MaxIn2dArray
{
	public static void main(String[] args)
	{
		int[][] arr = {
			{2,3,5,6},
			{2,7,5,2},
			{13,45,67}
		};

		int result = max(arr);
		System.out.print(result);
	}

	static int max(int[][] nums)
	{
		int max = nums[0][0];
		
		for(int row = 0; row<nums.length; row++)
		{
			for(int col = 0; col<nums[row].length; col++)
			{
				if(nums[row][col] >max)
					max = nums[row][col];
			}
		}
		return max;
	}
}