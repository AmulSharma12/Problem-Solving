package com.amul;
import java.util.Scanner;
public class P4_2NoHcFLcm {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int ognum1 = num1;
        int ognum2 = num2;
        while(num1%num2 == 0)
        {
            int rem = num1%num2;
            num1 = num2;
            num2 = rem;
        }
        int gcd = num2;
        System.out.println(gcd);
        int lcm = (ognum1 * ognum2)/gcd;
        System.out.println(lcm);

    }
}
