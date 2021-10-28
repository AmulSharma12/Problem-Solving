import java.util.Scanner;
// Given sorted array and a target element 
// you have to find the floor of a target element
// floor means the largest element which is smaller than equal to target

public class P4_FloorOfNo
{
	public static void main(String[] args)
	{
		int[] arr = {16,45};
		int target = 15;
		int index =  floorOfNo(arr,target);
		if(index != -1)
			System.out.println("key Found ");
		else 
			System.out.println("Not Found ");
	}


	// Floor Guide
	static int floorOfNo(int[] arr, int target)
	{
		int start = 0;
		int end = arr.length - 1;
		int mid = 0;

		// if my key is there in the array(sorted)
		while(start <= end)
		{
			mid = start + (end-start)/2;
			
			if(arr[mid] == target)
				return mid ;

			else if(arr[mid] < target)
				start = mid + 1;

			else
				end = mid - 1;
		}


		// comes only when key not found then you have to returns the element 
		// start/end/mid
		// end  ans  end/mid
		// end pointer says that greater no which is smaller than target
		return end;
	}
}