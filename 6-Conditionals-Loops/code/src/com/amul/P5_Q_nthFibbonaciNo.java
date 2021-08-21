package com.amul;
import java.util.Scanner;
public class P5_Q_nthFibbonaciNo {
    public static void main(String [] args)
    {
//        find the nth fibbonaci number
//        first two numbers are fixed 0 and 1 and the series afterwards obtained by adding
//        previous numbers 0 1 1 2 3 5 8 .....

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;       //previous
        int b = 1;       //current
        int count = 2;
        while(count<=n)
        {
            int temp = b;
             b = a + b;
             a = temp;
             count++;
        }
        System.out.println(b);

    }
}
