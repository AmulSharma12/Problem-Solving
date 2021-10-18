import java.util.Scanner;

// number  : 21453 ->23154
// position: 54321 ->54321
// 2 assumptions 
// digits in a number should not be repeated
// all digits between 1 to n should exist exactly once 
public class P4_InverseNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int pos = 0,rev = 0,digit = 0;
		while(n>0)
		{
			pos++;
			digit = n%10;
			n = n/10;
			rev += pos * (int)Math.pow(10,digit-1);
		}
		System.out.println(rev);
	}
}