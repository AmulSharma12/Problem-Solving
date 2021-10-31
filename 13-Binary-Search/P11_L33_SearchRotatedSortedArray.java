import java.util.Scanner;
//You have to search in rotated sorted array
//first you can find the pivot element t
//then check whether target and pivot element is equal i.e. return from here itself
//otherwise  check where target lies if it is greater than or equal then lies on left half
//otherwise right half

public class P11_L33_SearchRotatedSortedArray
{
	public static void main(String[] args)
	{
		int[] arr = {2,2,2,2,9};
		int target = 2;
		int index = search(arr,target);
		if(index != -1)
			System.out.println(index + " " + arr[index]);
		else
			System.out.println("Not Found");

		// System.out.println(findPivot(arr));
	}


	//function  search in rotated sorted array
	public static int search(int[] nums, int target) {
		int pivot = findPivotDuplicate(nums);


		if(pivot == -1)
		{
			//if pivot not found then apply normal binary search
        	return binarySearch(nums,target,0,nums.length-1);
		}

		//if pivot itself is my target
		if(nums[pivot] == target)
				return pivot;

		//where target lies if target >= first element means left halfof pivot
		if(target >= nums[0])
				return binarySearch(nums,target,0,pivot);

		 // in right part of pivot
		return binarySearch(nums,target,pivot+1,nums.length-1);
		
    }

    //Finding The Pivot Function
    //we have array like this 4,5,6,7,0,1,2 so pivot is basically greater element
    //i.e. 7  means there is two asecending arrays form element 4 to 7  and 0 to 2
    //but there is one part in sorted rotated array the point to which pivot points
    //is greater element and the very next element next sorted asecending array start
    //that is obvious lesser than pivot so that part of two element is desecendign
    // part i.e 7 and then 0

    //pivot lies in desecending part
    static public int findPivot(int[] arr)
    {
    	int start = 0;
    	int end = arr.length-1;
    	int mid = 0;

    	while(start <= end)
    	{
    		mid = start + (end-start)/2;
    		// Case 1: when mid > mid +1  then my middle is pivot  
    		//7(mid)(pivot) 0(mid+1)
    		if(mid < end && arr[mid] > arr[mid+1])
    			return mid;


    		//case 2 when my mid element is smaller than previous then
    		//my mid -1 is greater element and also shows asecending so my mid-1
    		//is pivot elemnet  
    		//7(mid-1)(pivot) 0(mid)
    		if(mid > start && arr[mid] < arr[mid-1]) 
    			return mid - 1;

    		//case 3&4 when my pivot is not around mid then were we go
    		//so it is obvious it is sorted rotated array then all the element
    		//which is smaller than first index element is lies on right half
    		//and all the element which is greater than lies on left half of pivot(greater element)
    		//4       5 6 7 				0 1 2
    		//start   greatertostart   smallertostart
    		//if start greater then lies on right half
    		//if start smaller then lies on left half

    		//start greater -> right half we know greater is somewhere left
    		//then we ignore right part so end update
    		if(arr[start] >= arr[mid]) 
    			end = mid - 1;

    		//here start smaller -> left half then we update start 
    		else
    			start = mid + 1;  
    	}


    	//not able to find the pivot
    	return -1;
    }


    //binarySearch Function
    static int binarySearch(int[] a, int target, int start, int end)
    {
    	int mid = 0;

    	while(start <= end)
    	{
    		mid = start + (end-start)/2;

    		if(a[mid] == target)
    			return mid;

    		else if(target > a[mid])
    			start = mid + 1;

    		else
    			end = mid - 1;
    	}

    	//if we not found target
    	return -1;
    }


    //finding pivot for duplicates 
    static int findPivotDuplicate(int[] nums)
    {
    	int start = 0;
    	int end = nums.length-1;
    	int mid = 0;

    	while(start <= end)
    	{
    		mid = start + (end-start)/2;

    		//case 1 is same
    		if(mid<end && nums[mid]>nums[mid+1])
    			return mid;

    		//case 2 is same
    		if(mid>start && nums[mid]<nums[mid-1])
    			return mid-1;

    		//case 3 if start and end and mid equal
    		if(nums[start] == nums[mid] && nums[end] == nums[mid])
    		{
    			// check start is  pivot
    			if(nums[start] > nums[start+1])
    				return start;
    			//if start is not pivot will skip the element
    			start++;

    			//check end is  pivot
    			if(nums[end] < nums[end-1])
    				return end-1;
    			//otherwise skip the element
    			end--;
    		}
    		else if(nums[mid] > nums[start] || (nums[start] == nums[mid] && nums[mid]>nums[end]))
    			start = mid + 1;
    		else 
    			end = mid - 1;
    	}
    	return -1;

    }
}


