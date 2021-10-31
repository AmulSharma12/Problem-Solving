import java.util.Scanner;

//LeetCode852  : Peak Index  In Mountain Array
//https://leetcode.com/problems/peak-index-in-a-mountain-array/      

public class P8_LeetCode852
{
	public static void main(String[] args)
	{
		int[] arr = {0,1,0};
		int mountainIndex = peakIndexInMountainArray(arr);
		System.out.println(mountainIndex);
	}

	public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        int mid = 0;
        while(start < end)
        {
        	mid = start + (end-start)/2;

        	//no chances of equal because duplicates are not allowed

        	//if my first element bigger then it is in decreasing order so maximum lies in left side 
        	//no need to check from mid because mid + 1 greater
        	if(arr[mid] > arr[mid+1])
        		end = mid;

        	//else first element smaller than it is in increasing order so maximum lies in rigth side
        	//so we have to check from end to left side;  
        	else
        		start =  mid + 1;

        }

        //at the end both start and end lies on one element  so there is no checks further so this will be the 
        //greater elemnet or peakIndexInMountainArray  as it has passed the checks and come closer to that element

        return start;
    }
}