import java.lang.*;
import java.util.Scanner;

public class P5_FindMaxInRange
{
	public static void main(String[] args)
	{
		int[] arr ={2,3,46,8,9,2,5,79};
		int result = min(arr,0,5);
		System.out.print(result); 
	}

	static int min(int[] nums, int start ,int end)
	{
		int max = nums[0];
		for(int i = start; i<=end; i++)
		{
			if(nums[i]>max)
				max = nums[i];
		}
		return max;
	}
}