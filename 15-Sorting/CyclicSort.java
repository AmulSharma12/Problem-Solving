import java.util.Scanner;
import java.util.Arrays;


public class CyclicSort
{
	public static void main(String[] args)
	{
		int[] arr = {5,3,4,2,1};
		cycleSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	//cycleSort Function
	private static void cycleSort(int[] nums)
	{
		int curr_Index = 0;
		int n = nums.length;

		while(curr_Index < n)
		{
			//for that element this is the correct index
			int correct_Index = nums[curr_Index] - 1;

			//swap in case if the element present in the current index is not in the correct index 
			if(nums[correct_Index] != nums[curr_Index])
				swap(nums,curr_Index,correct_Index);
			else
				curr_Index++;
		}
	}


	private static void swap(int[] nums, int first, int last)
	{
		int temp = nums[first];
		nums[first] = nums[last];
		nums[last] = temp;
	}
}

