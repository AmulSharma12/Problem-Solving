import java.util.Scanner;


public class P2_LeetCode1528
{
	public static void main(String[] args)
	{
		int[] arr = {4,5,6,7,0,2,1,3};
		String s = "codeleet";
		String result = restoreString(s,arr);
		System.out.println(result);
	}


	public static String restoreString(String s, int[] indices) {
       StringBuilder result = new StringBuilder(s);
        int n = s.length();
        
        for(int i = 0; i<n; i++)
        {
            int index  = indices[i];
            char element = s.charAt(i);
            result.setCharAt(index , element);
        }
        
        
        return result.toString();
    }
}