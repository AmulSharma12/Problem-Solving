import java.util.Scanner;
/*

*/
public class Pattern15
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int space = n/2;
		int value = 1;
		int number = 0;
		for(int i = 1; i<=n; i++)
		{
			for(int j = 1; j<=space; j++)
				System.out.print("  ");

			for(int j = 1; j<=value; j++)
			{
				if(j<=n/2)
					number ++;
				else
					number --;
				System.out.print(number + " ");
			}	

			if(i<=n/2){
				space --;
				value += 2;
			}
			else{
				space ++;
				value -= 2;
			}

			System.out.println();
		}
	}
}