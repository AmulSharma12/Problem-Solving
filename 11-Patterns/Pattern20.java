import java.util.Scanner;

public class Pattern20
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();  

		for(int i = 1; i<=n; i++)
		{
			for(int j = 1; j<=n; j++)
			{
				if(i == 1 || i == n)
					System.out.print("* ");
				else if(i<=n/2+1)
				{
					if(i == j || i+j == n+1)
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				else if(i<n)
				{
					while(i != j){
						
					}
				}
			}
		}
	}
}