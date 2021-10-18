import java.util.Scanner;
// Counting No Of Digits In A Number
// 123  ->3
// 1234 ->4
// 0    ->0

public class P1_CountDigits
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n<0)
			n = n * -1;
		int nod = 0;
		while(n>0)
		{
			n = n/10;
			nod ++;
		}
		System.out.println("No of Digits " + nod);
	}
}