import java.util.Scanner;

//Multiplying Table Pattern
public class Pattern12
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i = 1; i<=10; i++)
		{
			System.out.print(n + " X " + i + " =  " + n*i);
			System.out.print('\n');
		}
	}
}