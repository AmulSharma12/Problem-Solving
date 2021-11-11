// https://leetcode.com/problems/valid-perfect-square/
// Valid Perfect Square

import java.util.Scanner;
public class P5_L367ValidPerfectSquare
{
	public static void main(String[] args)
	{
		System.out.println(isPerfectSquare(17));
	}

	//Leetcode 367 Solution -> Binary Search  ->  isPerfect Square
	 static public boolean isPerfectSquare(int num) {
        int start = 1;
        int end = num;
        int mid = 0;

        while(start <= end)
        {
        	mid = start + (end-start)/2;
        	if(((long)mid*mid) == num)
        		return true;

        	if(((long)mid*mid) > num)
        		end = mid - 1;
        	else
        		start = mid + 1;
        }

        return false;
    }
}