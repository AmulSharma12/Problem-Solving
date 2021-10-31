//Amazon interview questions
// find the target in an sorted infinite arrays
//we have to assume it is a infinite array what i mena to  says  that we not use end directly
//from top down approch we can derive that in top down we will keep dividing by 2 till log(n) steps we will reach to single elemnet
//and we dont know end so we will start from one element and we will keep multiplying size by 2
//1.so we will first find in what range 


import java.util.Scanner;
import java.util.Arrays;

public class P7_FindInfiniteArray
{
	public static void main(String[] args)
	{
		int[] arr = {1,24,64,89,90,91,96,98,123,125,136,150,183,197};
		int target = 150;
		int index = findInfiniteArray(arr,target);
		System.out.println(index + " " + arr[index]);
	}


	static int findInfiniteArray(int[] arr, int target)
	{
		int start= 0;
		int end = 1;
		int size = 2;

		while(target > arr[end])
		{
			size = 2*size;
			start  = end + 1;
			end = start + size - 1; 
		}
		int result = binarySearch(arr,target,start,end);
		return result;
	}

	static int binarySearch(int[] nums, int key, int s, int e)
	{
		int mid = 0;
		while(s <= e)
		{
			mid = s + (e-s)/2;
			if(key == nums[mid])
				return mid;

			else if(key > nums[mid])
				s = mid +1;

			else
				e = mid - 1;
		}

		return -1;
	}
}