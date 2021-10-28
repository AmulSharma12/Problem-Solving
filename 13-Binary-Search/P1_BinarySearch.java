import java.util.Scanner;


public class P1_BinarySearch
{
	public static void main(String[] args)
	{
		int[] arr ={-18, -2, 0, 1, 23, 34, 45, 67};
		int target = 23;
		int index = binarySearch(arr,target);
		if(index != -1)
		{
			System.out.println(arr[index] + " Element Found");
		}
		else
		{
			System.out.println("Element Not Found");
		}

	}

	// binarySearch function returns the index
	static int binarySearch(int[] arr, int target)
	{
		if(arr.length == 0) 
			return -1;

		int start = 0;
		int end = arr.length-1;

		// checking in O(logn)
		while(start <= end)
		{
			// better way to find mid
			int mid = start + (end-start)/2;

			// if in middle index of array found element we will return index
			if(arr[mid] == target)
				return mid;

			// when target greater  means lie on right part of mid  mid+1--------end
			else if(arr[mid] < target)
				start = mid + 1;

			// when target smaller means lie on left part of mid    start----------mid-1
			else if(arr[mid] > target)
				end = mid - 1;


		}

		// if we have not able to returns means we are not able to found the element 
		return -1;
	}
}