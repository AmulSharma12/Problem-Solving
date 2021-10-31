import java.util.Scanner;
// LeetCode162  : peak element index
// https://leetcode.com/problems/find-peak-element/
// Multiple Peak Possible return to any of the index
public class P9_LeetCode162
{
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,1};
		int peakElement = findPeakElement(arr);
		System.out.println(peakElement); 

	}

	public static int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        int mid = 0;


        while(start < end)
        {
        	mid = start + (end-start)/2;

        	//if first element greater means it is present in decreasing order so peak element lies on left side
        	if(nums[mid] > nums[mid+1])
        		end = mid;

        	//else it is smaller means it is present in increasing order so peak element lies on right side
        	else
        		start = mid + 1;
        }
        
        //when condition breaks start/end both lies on the peak element
        return start;
    }
}