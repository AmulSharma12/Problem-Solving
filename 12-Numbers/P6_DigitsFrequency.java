import java.util.Scanner;

//occurence of a digit in a number
// 123565645
// 3

public class P6_DigitsFrequency
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int digit = sc.nextInt();
		int freq = 0;

		while(n>0)
		{
			if(n%10 == digit)
				freq ++;
			n /= 10;
		}
		System.out.println(freq);
	}
}