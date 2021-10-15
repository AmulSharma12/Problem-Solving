import java.util.Scanner;

/*
Printing Diagonal Left align
 *
  *
   *
    *
     *
*/

public class Pattern5
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		// when i and j equal then star otherwise space
		for(int i = 0; i<n; i++)
		{
			for(int j = 0; j<n; j++)
			{
				if(i == j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}