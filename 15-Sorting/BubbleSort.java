import java.util.Scanner;
import java.util.Arrays;
// Bubble Sort Algor
public class BubbleSort
{
	public static void main(String[] args)
	{
		int[] arr = {1 ,23, 12, 9, 30 ,2, 50};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void bubbleSort(int[] nums)
	{
		boolean isSwap = false;
		//outer loop n-1 times
		for(int i = 0; i<nums.length-1; i++)
		{
			

			//inner loop till unsorted array
			for(int j = 1; j<nums.length-i; j++)
			{
				//swap if greater 
				if(nums[j-1] > nums[j])
				{
					int temp = nums[j];
					nums[j] = nums[j-1];
					nums[j-1] = temp;
					isSwap = true;
				}
			}

			//if no swap happens then it is sorted
			if(isSwap)
				break;
		}
	}
}

