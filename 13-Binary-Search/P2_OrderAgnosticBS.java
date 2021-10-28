import java.util.Scanner;
 
 // we know array is sorted 
public class P2_OrderAgnosticBS
{
	public static void main(String[] args)
	{
		// int[] arr = {-12,-2,0,2,32,35,245,4759};
		// int[] arr = {54,32, 32, 21,1,0, -3, -55};
		int[] arr = {};
		int target = 35;
		int index = orderAgnosticBS(arr,target);
		if(index != -1)
		{
			System.out.println("Found : " + arr[index]);
		}
		else
		{
			System.out.println("Not Found ");
		}
	}

	// orderAgnosticBS GUIDE
	static int orderAgnosticBS(int[] arr, int target)
	{
		if(arr.length == 0)
			return -1;

		int start = 0;
		int end = arr.length-1;

		// checking array sorted but in which direction
		boolean isAsec = arr[end] > arr[start];


		// start searching by binarySearch Algorithim
		while(start<=end)
		{
			int mid = start + (end-start)/2;

			if(arr[mid] == target)
				return mid;

			// asencding order
			if(isAsec)
			{
				if(arr[mid] < target)
					start = mid + 1;
				else 
					end = mid - 1;
			}
			// desecending order
			else
			{	
				if(arr[mid] < target)
					end = mid - 1;
				else 
					start = mid + 1;
			}

		}

		return -1;
	}
}