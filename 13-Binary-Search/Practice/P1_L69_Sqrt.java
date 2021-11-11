// https://leetcode.com/problems/sqrtx/

//given a non negative integer integer you have to return sqrt  of that not number
// if float value exist still you have to return integer value

public class P1_L69_Sqrt
{
	public static void main(String[] args)
	{
		System.out.println(mySqrt(8));
	}


	 // brute force
	// static public int mySqrt(int x) {
	// 	int num = 0;

	// 	//if my num exist this is ans where it square is equal to x
	// 	while((num*num) <= x)
	// 	{
	// 		if((num*num) == x)
	// 			return num;
	// 		else
 			// num++;
//    	}

 //    	//means it will exceed the limit so it will lies just precceded one
 //    	num--;
 //    	return num;
 //    }


	// Optimized : binary search
	  static public int mySqrt(int x){
	  	int start = 0;
	  	int end = x;
	  	int mid = 0;

	  	while(start != end)
	  	{

			// you will calculate one of the ans and on the basis of which eliminate
	  		mid = start + (end-start)/2;



	  		//if my mid is ans    that means mid*mid = x  
	  		// means square of any number  is = sqareroot of that square is number  2*2= 4   =>  sqrt(4)=2
	  		if((mid*mid) == x)
	  			return mid;

	  		if(x<(mid*mid))
	  			end = mid -1;
	  		else
	  			start = mid + 1;

	  	}

	  	//at the end when my last ans will come that is pointing to mid 
	  	return mid;
	  }
}