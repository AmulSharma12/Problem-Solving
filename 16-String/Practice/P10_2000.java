//https://leetcode.com/problems/reverse-prefix-of-word/
// reverse prefix of word

import java.util.Scanner;

public class P10_2000
{
	public static void main(String[] args)
	{
		String word = "abcdefd";
		char ch = 'd';

		String result = reversePrefix(word , ch);
		System.out.println(result);
	}

	public static String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        // System.out.println(index);
        
        if(index == -1)  return word;
        
    
        StringBuilder sb = new StringBuilder();
     	for(int i = index ; i >= 0 ; i--)
     	{		
     		char charac = word.charAt(i);
     		// System.out.println(charac);
     		sb.append(charac); 
     	}  

     	String restPart = word.substring(index+1,word.length());
     	sb.append(restPart);
        
        return sb.toString();
    }
}