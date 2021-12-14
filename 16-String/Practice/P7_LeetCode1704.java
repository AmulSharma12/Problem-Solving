import java.util.Scanner;

public class P7_LeetCode1704
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		boolean s =  halvesAreLike("  ");
		System.out.println(s);
	}

	public static boolean halvesAreLike(String s)
	{
		int n = s.length();
		int half = n/2;
		int left_count = 0;    
		int right_count = 0;

		for(int i = 0; i<n; i++)
		{
			char cases = s.charAt(i);
			if(checkCase(cases))
			{
				if(i< half)
					left_count++;
				else
					right_count++;

			}
		}

		if(left_count == right_count)
			return true;

		return false;
	}

	public static boolean checkCase(char ch)
	{
		if(ch == 'a'  || ch == 'e' ||  ch == 'i'  || ch == 'o' || ch == 'u')
			return true;
		if(ch == 'A'  || ch == 'E' ||  ch == 'I'  || ch == 'O'  || ch == 'U')
			return true;

		return false;
	}
}