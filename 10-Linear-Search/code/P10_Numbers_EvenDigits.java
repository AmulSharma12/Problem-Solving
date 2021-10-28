import java.lang.*;
import java.util.Scanner;

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class P10_Numbers_EvenDigits
{
	public static void main(String[] args)
	{
		int[] arr = {12,345,2,6,7896};
		int result = findNumbers(arr);
		System.out.print(result);
	}

	 public static int findNumbers(int[] nums) {
	 	int count = 0;
        for(int i = 0; i<nums.length; i++)
        {
        	if(evenDigit(nums[i]))
        		count++;

        }
        return count;

    }

    static boolean evenDigit(int n)
        {
        	int nod = 0;
        	if(n<0)
        		n = n * -1;
        	if(n == 0)
        		return false;

        	while(n>0)
        	{
        		nod++;
        		n /= 10;
        	}
        	if(nod%2 == 0)
        		return true;
        	return false;
        }
}