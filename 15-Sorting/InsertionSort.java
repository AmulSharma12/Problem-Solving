import java.util.Scanner;
import java.util.Arrays;


class Insertion
{
	public  Insertion(int[] arr)
	{
		this.insertion(arr);
	}


	private static void insertion(int[] nums)
	{
		int lastIndex = nums.length-2;
		for(int i = 0; i<lastIndex; i++)
		{
			int nextIndex = i+1;
			for(int currIndex = nextIndex; currIndex>0; currIndex--)
			{
				int prev_Index = currIndex-1;
				if(nums[currIndex]< nums[prev_Index])
					swap(nums,currIndex,prev_Index);
				else
					break;
			}
		}
	}

	//swap function

	private static void swap(int[] arr, int first, int last)
	{
		int temp = arr[first];
		arr[first] = arr[last];
		arr[last] = temp;
	}
}


public class InsertionSort
{
	public static void main(String[] args)
	{
		int[] arr = {3,3,6,78,9};
		Insertion insSort = new Insertion(arr);
		// insertion(arr);
		System.out.println(Arrays.toString(arr));
	}
}