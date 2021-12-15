import java.util.Scanner;

public class P8_LeetCode1967
{
	public static void main(String[] args)
	{
		String[] patterns = {"a","abc","bc","d"};
		String word = "abc";
		int result = numOfStrings(patterns , word);
		System.out.println(result);

	}


	 public static int numOfStrings(String[] patterns, String word) {
        int n = patterns.length;
        int count = 0;
        
        for(int i = 0; i<n; i++)
        {
            if(word.contains(patterns[i]))
                count++;
        }
        
        return count;
    }
}