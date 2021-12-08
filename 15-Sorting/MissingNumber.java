import java.util.Scanner;
import java.util.Arrays;

// https://leetcode.com/problems/missing-number/submissions/
//amazon question LeetCode268
public class MissingNumber
{
	public static void main(String[] args)
	{
		int[] arr = {4,3,2,1};
		int result = missingNumber(arr);
		System.out.println(result);
	}


	public static int missingNumber(int[] nums)
	{
		int n = nums.length;
		int curr_Index = 0;

		while(curr_Index < n)
		{
			int correct_Index = nums[curr_Index];
			if((nums[curr_Index] < n) && (nums[correct_Index] != nums[curr_Index]))
				swap(nums,correct_Index, curr_Index);
			else
				curr_Index++;
		}



		//traversing through array is current index is equal to element if any element found not equal then index will
		// be my ans
		// or one other case there will be chance the last number will be missing

		for(int currIndex = 0; currIndex<n;  currIndex++)
		{
			if(currIndex != nums[currIndex])
				return currIndex;
		}

		//missing number will be the last number if it reaches till here
		return n;
	}


	//swap function
	public static void swap(int[] arr, int first, int last)
	{
		int temp = arr[first];
		arr[first] = arr[last];
		arr[last] = temp;
	}
}