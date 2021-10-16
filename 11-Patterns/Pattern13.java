import java.util.Scanner;
/*
Fibbonaci Pattern
0
1 1
2 3 5
8 13 21 34
*/

public class Pattern13
{
	public static void main(String[] args)
	{
		int curr = 0;
		int next = 1;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1; i<=n; i++)
		{
			for(int j = 1; j<=i; j++)
			{
				System.out.print(curr + "  ");
				int temp = next;
				next = curr + next;
				curr = temp;
			}
			System.out.println();
		}
	}
}