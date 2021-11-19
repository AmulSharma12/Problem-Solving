// https://leetcode.com/problems/search-insert-position/
// LEETCODE 35(Easy)----------------->search Insert Position
 
import java.util.Scanner;
public class P8_L35SearchInsertPostition
{
	public static void main(String[] args)
	{
		int[] arr = {1,3,5,6};
		int result = searchInsert(arr,4);
		System.out.println(result);
	}

	// LeetCode35 Solution(Brute Solution -> Linear Search)
	static public int searchInsert1(int[] nums, int target)
	{
     	for(int i = 0; i<nums.length; i++)
     	{
     		//if target found return the index 
     		if(nums[i] == target)
     			return i;

     		//if target not found return the index where the element greater than target
     		if(nums[i] > target)
     			return i;
     	}   

     	//no target element found or even greater element equal to array length which is greater than last index

     	return nums.length;
    }



    // Optimised O(logn) Solution -> Binary Search
      static public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int mid = 0;
        
        //edge case where last element is also smaller than target
        //so we return one incremented index (excepted)
        if(nums[end] < target)
            return end + 1;
        
        while(start <= end){
            mid = start + (end-start)/2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
    
        //start is pointing to the element which is just 
        //greater than target
        return start;
    }  
}