import java.lang.*;
import java.util.Scanner;

public class P6_FindMin
{
	public static void main(String[] args)
	{
		int[] arr = {4,5,6,78,2,2,57};
		int result = min(arr);
		System.out.print(result);
	}

	static int min(int[] nums)
	{
		int min = nums[0];
		for(int i = 0; i<nums.length; i++)
		{
			if(nums[i]<min)
				min = nums[i];
		}

		return min;
	}
}