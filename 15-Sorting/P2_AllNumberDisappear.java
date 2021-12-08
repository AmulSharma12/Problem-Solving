import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
// Google Interview Question
// 	Find All Numbers Disappeared In array
// LeetCode 448 Solution

public class P2_AllNumberDisappear
{
	public static void main(String[] args)
	{
		int[] arr = {4,3,2,7,8,2,3,1};

		List<Integer> result = findDisappearedNumbers(arr);
		for(Integer element : result)
			System.out.print(element + " ");
	}


	//LeetCode 448 Solution
	public static List<Integer> findDisappearedNumbers(int[] nums) 
	{
        int n = nums.length;
        int currIndex = 0;
        while(currIndex < n)
        {
        	int correctIndex = nums[currIndex]-1;

        	 if(nums[currIndex] != nums[correctIndex])
        	 	swap(nums,currIndex, correctIndex);
        	 else
        	 	currIndex ++;
        }


        //all the numbers disappeared will be added to the list
        List<Integer> result = new ArrayList<>();
        for(int index = 0 ; index<n ; index++)
        {
        	int expectedElement = index + 1;
        	if(nums[index] != expectedElement)
        		result.add(expectedElement);
        }

        return result;
    }

    // swap function
    private static void swap(int[] arr, int first , int last)
    {
    	int temp = arr[first];
    	arr[first] = arr[last];
    	arr[last] = temp;
    }
}