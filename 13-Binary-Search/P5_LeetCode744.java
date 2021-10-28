 import java.util.Scanner;

public class P5_LeetCode744
{
	public static void main(String[] args)
	{
		char[] letter = {'c','f','j'};
		char ch = 'j';

		char result = nextGreatestLetter(letter,ch);
		System.out.println(result);

	}


	// nextGreaterLetter
	static  char nextGreatestLetter(char[] letters, char target) 
	{
        int start = 0;
        int end = letters.length-1;
        int mid = 0;

        while(start <= end)
        {
        	// calculating mid 
        	mid = start + (end-start)/2;

        	if(target < letters[mid]) 
        		end = mid - 1;
        	else
        		start = mid + 1;
        }

        // when you have not found the element in key
        // first will check target is greater than to last element 
        // if so means there would be no element in array greater than target
        // so we would return the first element  i.e. letters wrap around
        return letters[start% letters.length];
    }
}