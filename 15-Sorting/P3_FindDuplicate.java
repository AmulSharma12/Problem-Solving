// LeetCode 287 Medium  -> Find the duplicate number
// Amazon Interview Question
// in range 1 to n apply cyclic sort


public class P3_FindDuplicate 
{
	public static void main(String[] args)
	{
		int[] arr = {1,3,4,2,2};
		int result = findDuplicate(arr);
		System.out.println(result);
	}

	// LeetCode 287 solution
	public static int findDuplicate(int[] nums) {
     	int n = nums.length;
     	int currIndex = 0;

     	while(currIndex < n)
     	{
     		int corrIndex = nums[currIndex] - 1;
     		if(nums[currIndex] != nums[corrIndex])
     			swap(nums, currIndex, corrIndex);
     		else
     			currIndex++;
     	}   


     	//finding the duplicate caught in the incorrect index
     	for(int index = 0; index < n; index++)
     	{
     		int element = nums[index];
     		int corrIndex = index + 1;

     		//if my element in the index is not in the correct index then will return from here itself
     		if(element != corrIndex)
     			return element;
     	}

     	//otherwise no duplicate found then return -1
     	return -1;
    }


    //swap function
    public static void swap(int[] arr, int first, int second)
    {
    	int temp = arr[first];
    	arr[first] = arr[second];
    	arr[second] = temp;
    }
}