// https://leetcode.com/problems/kth-missing-positive-number/
// Kth-missing Positive Integer
// given array of integers and the value k


//brute force Approcah

import java.util.Scanner;
import java.util.ArrayList;
 
 public class P7_L539_KthmissingInteger
 {
 	public static void main(String[] args)
 	{
 		int result = findKthPositive(new int[]{2,3,4,7,11} , 5);
 		System.out.println(result);
 	}

 	static public int findKthPositive(int[] arr, int k) {
        int maxAns = arr[arr.length-1] + k;
        ArrayList<Integer> ds = new ArrayList<>();
        //putting all the element into data structure
        for(int i = 0; i<arr.length; i++)
          ds.add(arr[i]);


        //now we check if element is in data structure then  i will skip to next 
        //if not present i will make kth index decrement by 1

        int i ;
        for(i = 1; i<=maxAns  && k!=0;i++)
        {
           if(ds.contains(i))
              continue;
          else 
            k--;
        }

        //this will stop when i found my ans and stop after k==0 then my index i will have an ans
        //but still it has already incremented i by one value so we will return with i-1
        return i-1;
        
    }
 }

