import java.util.Scanner;

// Printing A Number In A ReverseOrder
// 1234
// 4
// 3
// 2
// 1

public class P3_ReverseNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n == 0)
			System.out.println(n);
		if(n<0)
			n = n* -1;
		while(n>0)
		{
			System.out.println(n%10);
			n = n/10;
		}
	}
}