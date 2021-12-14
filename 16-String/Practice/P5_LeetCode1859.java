// 1859. Sorting the Sentence

import java.util.Scanner;

public class P5_LeetCode1859
{
	public static void main(String[] args)
	{
		String s = "is2 sentence4 This1 a3";
		System.out.println(s.length());
	}

	  public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int m = word1.length;
        int n = word2.length;
        
        StringBuilder w1 = new StringBuilder();
        StringBuilder w2  = new StringBuilder();
        
        for(int i = 0; i<m; i++)
            w1.append(word1[i]);
        
        for(int j = 0; j<n; j++)
            w2.append(word2[j]);
        
        //Checking whether w1 and w2 concat results are true/false
        if(w1.toString().equals(w2.toString()))
            return true;
        else
            return false;
        
    }
}