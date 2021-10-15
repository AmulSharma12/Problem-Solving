import java.util.Scanner;

/*
Right align Decreasing Triangle
* * * * *
  * * * *
    * * *
      * *
        *
*/

public class Pattern4{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i<n; i++)
		{
			//spacing varies from 0->1->2->3->4
			for(int space = 0; space<i; space++)
				System.out.print("  ");

			//star printing varies from 5->4->3->2->1
			for(int star = i; star<n; star++)
				System.out.print("* ");

			//Line change 
			System.out.println();
		}
	}
}