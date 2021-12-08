import java.util.Scanner;
import java.util.Arrays;


public class SelectionSort
{
	public static void main(String[] args)
	{
		int[] arr = {1 ,23, 12, 9, 30 ,2, 50};
		selection(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void selection(int[] nums)
	{
		//for n-1 times
		for(int i = 0; i<nums.length-1; i++)
		{
			//will find max in remaining part and swap with the correct index i.e. last index
			int last = nums.length-i-1;
			int maxIndex = getMaxIndex(nums,0,last);
			swap(nums,last,maxIndex);
		}
	}



	//finding the max index
	public static  int getMaxIndex(int[] arr, int start , int end)
	{
		int max = start;

		for(int i = start; i<= end; i++){
			if(arr[i] > arr[max])
				max = i;
		}

		return max;

	}


	//swap function
	public static void swap(int[] arr, int first ,int second)
	{
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
}