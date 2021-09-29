import java.lang.*;
import java.util.Scanner;

public class P3_SearchInRange
{
	public static void main(String[] args)
	{
		int[] arr = {1,2,34,43,67,78,67,90};
		int target = 34;

		System.out.print(search(arr,target,0,5));
	}

	static boolean search(int[] a ,int key,int start,int end)
	{
		if(a.length == 0)
			return false;
		for(int i = start; i<=end; i++)
		{
			if(a[i] == key)
				return true;
		}
		return false;
	}
}