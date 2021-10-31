 // P6_LeetCode34
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
//Amazon Interview Question
//Find First And Last Position of element in Sorted Array
// int[] nums = {5,7,7,8,8,10};
// int target = 8;
// OUTPUT : [3,4]   if not found [-1,-1]

import java.util.Scanner;
import java.util.Arrays;
public class P6_LeetCode34
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] arr ={5,7,7,8,8,10};
		int target = 8;

		int[] result = searchRange(arr,target);
		System.out.println(Arrays.toString(result));

		// for(int element:result)
		// 	System.out.print(element);
	}


	//search for first and last position of target
	static public int[] searchRange(int[] nums, int target) {
	        int[] ans = {-1,-1};

	        // first position of target
	        ans[0] = search(nums,target,true);

	        // last position of target
	        //if my first occurence is -1 means there is no first occurence so there will be no last occurence
	        if(ans[0] != -1)
	        {
	        	ans[1] = search(nums,target,false);
	        }

	        return ans;
    }


    static int search(int[] arr, int target, boolean firstOccurence)
    {
    	int index = -1;
    	int start = 0;
    	int end = arr.length-1; 
    	int mid = 0;

    	while(start <= end)
    	{
    		mid = start + (end-start)/2;

    		if(target > arr[mid])
    			start = mid + 1;

    		else if (target < arr[mid])
    			end = mid - 1;

    		//if we found mid either this will be ans or it will have more ans followed in either direction
    		else
    		{
    			// one possible answer will be stored
    			index = mid;

    			//other answer will be there in either direction
    			if(firstOccurence)    // In Left Direction first Occurence chance
    				end = mid - 1;
    			else
    				start = mid + 1;

    		}
    	}


    	return index;
    }
}