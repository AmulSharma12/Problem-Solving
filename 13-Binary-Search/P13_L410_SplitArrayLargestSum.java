import java.util.Scanner;
// import java.lang.Math;
// https://leetcode.com/problems/split-array-largest-sum/

public class P13_L410_SplitArrayLargestSum
{
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5};
		int m = 2;
		int ans = splitArray(arr, m);
		System.out.println(ans);
	}

	public static int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;

        //finding the range as minimum ans and maximum ans
        for(int i = 0; i<nums.length; i++)
        {
        	start = Math.max(start,nums[i]);
        	end += nums[i];

        }


        //apply binarySearch if we know range
        while(start < end)
        {
        	int sum = 0;
        	int pieces = 1;
        	// mid is my potential ans
        	int mid = start + (end - start)/2;

        	for(int element:nums)
        	{
        		if(sum+element <= mid)
        		{
        			sum += element;
        		}
        		else
        		{
        			sum = element;
        			pieces ++;
        		}
        	}

        	//checking pieces
        	if(pieces<=m)
        		end = mid;

        	//if pieces greater than mid means we go to large number so pieces would become less
        	else
        		start = mid + 1;
        }

        //at this start == end and this is ans
        return start;
    }
}