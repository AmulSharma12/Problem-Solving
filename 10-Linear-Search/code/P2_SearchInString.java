import java.lang.*;
import java.util.Scanner;

public class P2_SearchInString
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = "AmulOp";
		char target = 'u';

		//1st method for loop
		int indexNo = search(str,target);
		System.out.print(indexNo);
	}

	static int search(String s , char key)
	{
		if(s.length() == 0)
			return -1;

		for(int index = 0; index<s.length(); index++)
		{}
	}
}