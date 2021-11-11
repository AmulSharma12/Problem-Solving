// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
// Two-sum-II input array is sorted

import java.util.Scanner;
import java.util.Arrays;
public class P4_L167TwoSumTarget
{
	public static void main(String[] args)
	{
		//in order to make 1 indexed
		int[] arr = {0,2,7,11,15};
		System.out.println(Arrays.toString(twoSum(arr,9)));
	}


	// LeetCode 167 Solution ->  Brute Force
	//  static public int[] twoSum(int[] numbers, int target)
	// {
	// 	for(int i = 1; i<=numbers.length-1; i++)
	// 	{
	// 		//as from the next element will check that is why j=i+1
	// 		for(int j = i+1; j<=numbers.length; j++)
	// 		{
	// 			int twoSum = numbers[i] + numbers[j];
	// 			if(twoSum == target)
	// 				return new int[] {i,j};
	// 		}
	// 	}

 //       	return new int[] {-1, -1};
 //    }



	// LeetCode 167->Submitted
	// public int[] twoSum(int[] numbers, int target) {
 //        for(int i = 0; i<numbers.length-1; i++)
	// 	{
	// 		//as from the next element will check that is why j=i+1
	// 		for(int j = i+1; j<numbers.length; j++)
	// 		{
	// 			int twoSum = numbers[i] + numbers[j];
	// 			if(twoSum == target)
	// 				return new int[] {i+1,j+1};
	// 		}
	// 	}

 //       	return new int[] {-1, -1};
 //    }




	//Optimized -> Binary Search
	static public int[] twoSum(int[] numbers, int target) {
       
    }
}
}