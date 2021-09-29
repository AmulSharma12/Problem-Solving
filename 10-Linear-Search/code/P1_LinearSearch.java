import java.lang.*;
import java.util.Scanner;

public class P1_LinearSearch
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] nums = {1,2,3,5,7,8,94,2,-23};
		int target = sc.nextInt();
		int ans = linearSearch(nums,target);
		System.out.print(ans + " ");
	}

	static int linearSearch(int[] arr, int key)
	{
		if(arr.length == 0)
			return -1;

		for(int index = 0; index<arr.length; index++)
		{
			if(key == arr[index])
				return index;
		}
		return -1;
	}
}