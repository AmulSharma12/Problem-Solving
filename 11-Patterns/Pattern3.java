import java.util.Scanner;

// Right Align Increasing Triangle
//             *
//           * *
// 		   * * *
//  	 * * * *
// 	   * * * * *

public class Pattern3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i<n; i++)
		{
			//spacing varies from 4->3->2->1->0
			for(int j = i+1; j<n; j++)
				System.out.print("  ");

			//star varies from 1->2->3->4->5
			for(int j = 0; j<=i; j++)
				System.out.print("* ");

			//Line change
			System.out.println();
		}
	}
} 