// https://leetcode.com/problems/arranging-coins/
// ArrangingCoins

public class P6_L441ArrangingCoins
{
	public static void main(String[] args)
	{
		System.out.println(arrangeCoins(5));
	}


	//LeetCode 441 Solution -> arrangeCoins
	static public int arrangeCoins(int n) {
		//n -> no of coins you have to build staircase
		int stairsSize = 1;



		//if you have coin then and only you can build staircase
		while(n != 0)
		{

			//means with one stairs you can use one coins and
			while(stairsSize > 0)  {
				if(n != 0)
					return stairsSize-1;
				n--;
				stairsSize--;
			}

			//you can go to next stairs
			stairsSize++;

		}

		return stairsSize ;
        
    }
}