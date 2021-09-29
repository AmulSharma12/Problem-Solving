import java.util.Scanner;
import java.util.Arrays;
public class P8_2dSearch
{
	public static void main(String[] args)
	{
		int[][] arr = {
			{1,2,3},
			{4,3,6},
			{9,3,1}
		};

		int target = 4;
		int[] result = search(arr,target);
		System.out.print(Arrays.toString(result));

	}

	static int[] search(int[][] nums,int key)
	{
		for(int row = 0; row<nums.length; row++)
		{
			for(int col = 0; col<nums[0].length; col++)
			{
				if(nums[row][col] == key)
					return new int[]{row,col};
			}
		}
		return new int[]{-1,-1};
	}
}