import java.util.Scanner;
/* 
Pattern Permutation And Combinatation
1
1 1
1 2 1
1 3 3 1
1 5 10 10 5 1
*/

public class Pattern14
{
	// nc0 = ncr = 1
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int icj = 1;
		for(int i = 0; i<n; i++)
		{
			for(int j = 0; j<=i; j++)
			{
				System.out.print(icj +"\t");
				int icjp1 = icj * (i-j)/(j+1);
				icj = icjp1;
			}
			System.out.println();
		}
	}
}