import java.util.Scanner;
//how many times a sorted array rotated  returns in the output
public class P12_CountRotationSortedArray
{
	public static void main(String[] args)
	{
		int[] arr = {4, 5, 6, 7, 0, 1, 2, 3};
		int count = countRotations(arr);
		System.out.println(count);
	}


	static int countRotations(int[] nums)
	{
		int pivot = findPivot(nums);
		return pivot + 1;
	}


	static int findPivot(int[] arr)
	{
		int start = 0;
		int end = arr.length-1;
		int mid = 0;

		while(start <= end)
		{
			mid = start + (end - start)/2;

			//case 1 
			if(end>mid  && arr[mid] > arr[mid+1])
				return mid;

			//case 2
			if(mid>start && arr[mid-1] > arr[mid])
				return mid - 1;

			//case 3
			if(arr[0] >= arr[mid])
				start = mid + 1;

			//case 4
			else
				end = mid - 1;
		}

		return -1;
	}
}