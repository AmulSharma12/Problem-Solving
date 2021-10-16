import java.util.Scanner;
/*
1           1
1 2       2 1
1 2 3   3 2 1
1 2 3 4 3 2 1
*/

public class Pattern16
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int space = 2*n-3;

		for(int i = 1; i<=n; i++)
		{
			for(int j = 1; j<=i; j++)
				System.out.print(j + " ");

			for(int j = 1; j<=space; j++)
				System.out.print("  ");


			for(int j = i; j>0; j--){
				if(j != n)							
					System.out.print(j + " ");
			}
			space -= 2;
			System.out.println();
		} 
	}
}