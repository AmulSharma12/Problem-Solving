import java.util.Scanner;

public class P7_FindMinInRange
{
	public static void main(String[] args)
	{
		int[] arr = {2,3,4,67,8,91,5,6,7,8,8,9,555};
		int result = min(arr,4,9);
		System.out.print(result);

	}

	static int min(int[] nums, int start, int end)
	{
		int min = nums[start];
		for(int i = start+1; i<=end; i++)
		{
			if(nums[i]<min)
				min = nums[i];
		}

		return min;
	}
}