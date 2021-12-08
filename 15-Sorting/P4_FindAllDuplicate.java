// Amazon,Microsoft Interview Question
// LeetCode 442 Medium Solution
// Find all duplicates in array


import java.util.Scanner;
import java.util.List;
public class P4_FindAllDuplicate
{
	public static void main(String[] args)
	{
		int[] arr = {4,3,2,7,8,2,3,1};
		List<Integer> list = findDuplicates(arr);
		for(Integer element :list)
			System.out.print(element + " ");


	}


	// LeetCode 442 Solution
	public List<Integer> findDuplicates(int[] nums) {
		int n = nums.length;
		int currIndex = 0;

		while(currIndex < n)
		{
			int corrIndex = nums[currIndex] - 1;
			if(nums[currIndex] != nums[corrIndex])
				swap(nums, currIndex, corrIndex);
			else
				currIndex ++ ;
		}


		//finding all the duplicates
		List<Integer> result = new ArrayList<>();
		for(int index = 0; index<n; index++)
		{
			int element = nums[index];
			int expected = index + 1;
			if(element != expected)
				result.add(element);
		}


		//return the list data structure
		return result;
        
    }
}