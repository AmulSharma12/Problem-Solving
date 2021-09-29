import java.lang.*;
import java.util.Scanner;

public class P4_FindMax
{
	public static void main(String[] args)
	{
		int max;
		int[] arr = {2,3,5,78,9};
		max =  arr[0];
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i] > max)
				max = arr[i];
		}
		System.out.print(max);
	}
}