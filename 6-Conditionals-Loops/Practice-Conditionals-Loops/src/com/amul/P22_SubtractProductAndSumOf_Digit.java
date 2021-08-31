package com.amul;
import java.util.Scanner;

//     Subtract the Product and Sum of Digits of an Integer
public class P22_SubtractProductAndSumOf_Digit {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int ans = sub(no);
        System.out.println(ans);
    }

    //subtract Product and Sum of an Integer
    static int sub(int n)
    {
        int product = 1;
        int sum = 0;
        int sub = 0;
        while(n>0)
        {
            sum += n%10;
            product *= n%10;
            n /= 10;
        }
        sub = product - sum;
        return sub;
    }
}
