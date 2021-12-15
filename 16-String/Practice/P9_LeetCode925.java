//https://leetcode.com/problems/long-pressed-name/
// LeetCode 925 Long Pressed Name

import java.util.Scanner;

public class P9_LeetCode925
{
	public static void main(String[] args)
	{
		String name = "alex";
		String typed = "aaleex";
		System.out.println(isLongPressedName(name , typed));
	}


	 public static boolean isLongPressedName(String name, String typed) {
	 	int n = name.length();
	 	int m = typed.length();

	 	if(m < n)   return false;

	 	int nIndex = 0;
	 	int tIndex = 0;

	 	while(nIndex<n && tIndex<m)
	 	{
	 		char nChar = name.charAt(nIndex);
	 		char tChar = typed.charAt(tIndex);

	 		if(nChar == tChar)
	 		{
	 			nIndex += 1;
	 			tIndex += 1;
	 		}

	 		else{
	 			tIndex += 1;
	 		}
	 	}



	 	if(nIndex == n)
	 		return true;
	 	return false;
        
    }
}