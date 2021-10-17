import java.util.Scanner;
/*
Arrow
    *
    * * 
* * * * *
    * *
    *
*/


public class Pattern17
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i = 1; i<=n; i++)
		{
			if(i == n/2+1)
			{
				for(int j = 1; j<=n; j++)
					System.out.print("* ");
			}
			else
			{
				for(int j = 1; j<=n/2; j++)
					System.out.print("  ");

				if(i<=n/2)
				{
					for(int k = 1; k<=i; k++)
						System.out.print("* ");
				}
				else
				{
					for(int k = i; k<=n; k++)
						System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}