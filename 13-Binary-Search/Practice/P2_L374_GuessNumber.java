// https://leetcode.com/problems/guess-number-higher-or-lower/
// guess number higher or lower
import java.util.Scanner;

public class P2_L374_GuessNumber
{
	public static void main(String[] args)
	{
		int pick = 5;
		System.out.print(guessNumber(10));
	}

	//soulution
	static  public int guessNumber(int n) {
        int start = 1;
        int end = n;
        int mid = 0;

        while(start <= end)
        {
            //this is i guess
        	mid = start + (end-start)/2;
            int pick = guess(mid);  //return the result wrt to guess
        	
            if(pick == 0)                
        		return mid;
        	
            else if(pick == -1)
        		end = mid - 1;
        	
            else 
        		start = mid + 1;
        }

    //the no you picked in the range
    return -1;
    }
}