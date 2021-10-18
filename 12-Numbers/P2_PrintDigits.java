import java.util.Scanner;

// Printing All The Digits in new Line  From Left To Right
// 1234
// 1
// 2
// 3
// 4

public class P2_PrintDigits
{
	//for counting the no of digits
	static int nod(int n )
	{
		int result = 0;
		while(n>0)
		{
			n = n/10;
			result ++;
		}
		return result ;
	}

	// For Calculating The Divisor

	static int po(int a,int b)
	{
		return (int)Math.pow(a,b);
	}


	//Main Method
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n<0)
			n = n * -1;

		int div = po(10,nod(n)-1);
		if(n == 0)
			System.out.println(n);
		while(n>0)
		{
			System.out.println(n/div);
			n = n%div;
			div = div/10;
		}
	}

	
}