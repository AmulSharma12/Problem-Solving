// https://leetcode.com/problems/first-bad-version/
// first bade version

public class P3_L278FirstBadVersion
{
	public static void main(String[] args)
	{
		//demo
	}

	//Leetcode 278 Solution
	static public int firstBadVersion(int n) {
    	int start = 1;
    	int end = n;
    	int mid = 0;
    	int firstBadVersion = -1;			//this tells us ans 

    	while(start <= end)
    	{
    		mid = start + (end-start)/2;

    		//this api tells whether my mid id bad version-> true   or good version-> false
    		boolean isBadVersion = isBadVersion(mid);          


    		//tells this is a bad version
    		if(isBadVersion){
    			firstBadVersion = mid;

    			// checking before going left because my ans is exist till 1 only so
    			if(mid == 1) 	break;	  		//will not go left that is my only bad ans from left
    			else  			end = mid - 1;	//will able to check left is not last ansi.e.1
    		}


    		//tells this is a good version
    		else{

    			//check if it is possible to go checking right
    			if(mid == n)  break;             //we cant go right there is no bad version means
				else 		  start = mid + 1;	 //we can check if possible for bad versions 
    		}
    	}


    	//return the ans 
    	return firstBadVersion;
        
    }
}