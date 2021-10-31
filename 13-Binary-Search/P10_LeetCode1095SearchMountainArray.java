import java.util.Scanner;

// LeetCode1095  :  Search In Mountain Array Bitonic Array
// https://leetcode.com/problems/find-in-mountain-array/

//given an array and the target 
//1.first find the peak element 
// 2.then  we find in the left half because we have to find the target with minimum indexes
//3.if we not able to find in left half we will find in right half
//as it is mountain array first we have to apply the binarySearch in left/asecnding and then in right/desecending
//so we need orderAgnosticBinarySearch


public class P10_LeetCode1095SearchMountainArray
{
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5,3,1};
		int target = 3;
		int index = findInMountainArray(target,arr);
		System.out.println("index " + index + " element " + arr[index] );
	}


	//function findInMountainArray
	public static int findInMountainArray(int target, int[] mountainArr) {
		int peak = peakIndex(mountainArr);
		int start = 0;
		//search in left half
		int firstHalf = searchBothType(mountainArr,target,start,peak-1);

		//if we are able to find the ans means we return from here itself i.e. other than index -1
		if(firstHalf != -1)
			return firstHalf;

		//search in right half is only chance
		return searchBothType(mountainArr,target,peak,mountainArr.length-1);
        
    }


    //finding the peak index 
    static int peakIndex(int[] nums)
    {
    	int start = 0;
    	int end = nums.length-1;
    	int mid = 0;

    	while(start < end)
    	{
    		mid = start + (end-start)/2;

    		if(nums[mid] > nums[mid+1])
    			end = mid;
    		else
    			start = mid + 1;

    	}

    	//both start and end pointing to peak index 
    	return start;
    }


    //searching in both the type whether asecending/desending
    static int searchBothType(int[] arr, int target, int start, int end)
    {
    	boolean isAsec = arr[end] > arr[start];
    	int mid = 0;

    	while(start <= end)
    	{
    		mid = start + (end-start)/2;

    		if(arr[mid] == target)
    			return mid;

    		if(isAsec)
    		{
    			if(arr[mid] > target)
    				end = mid - 1;
    			else
    				start = mid + 1;
    		}
    		else
    		{
    			if(arr[mid] > target)
    				start = mid + 1;
    			else
    				end = mid - 1;

    		}

    	}

    	//target not found
    	return -1;
    }

} 