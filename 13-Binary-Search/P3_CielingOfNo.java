import java.util.Scanner;

public class P3_CielingOfNo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] arr = {2, 3, 5, 9, 14, 16, 8};
		int target = sc.nextInt();
		int index = cieling(arr,target);
		if(index != -1)
		{
			System.out.println("Found " + index);
		}
		else
		{
			System.out.println("Not Found ");
		}
	}


	// cieling of a no
	// smallest no which is greater or equal to target

	static int cieling(int[] arr, int target)
	{
		int start = 0;
		int end = arr.length-1;
		int mid;

		while(start<=end)
		{
			mid = start + (end-start)/2;
			if(arr[mid] == target)
				return mid;

			else if(arr[mid] < target)
				start = mid + 1;

			else
				end = mid - 1;
		}

		// comes when cant able to find the element 
		// so we have to find the element which is greater than target
		// so start is the first element which is greater than target
		return start;
	}
}