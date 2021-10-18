import java.util.Scanner;
// Rotate a Number

public class P5_RotateNumber
{
	static int count(int x)
	{
		int result = 0;
		while(x>0)
		{
			result++;
			x = x/10;
		}
		return result;
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int nod = count(n);
		k = k%nod;

		if(k<0)
			k = k +nod;
		int div = 1;
		int mul = 1;
		for(int i = 1; i<=nod; i++)
		{
			if(i<=k){
				div = div*10;
			}
			else{
				mul = mul *10;
			}
		}
		int q = n/div;
		int r = n%div;


		int rot = r*mul +q;
		System.out.println(rot);
	}
}