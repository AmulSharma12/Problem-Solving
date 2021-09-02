package com.amul;
import java.util.*;

public class P29_SumOfDigit_No {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int ans = sod(no);
        System.out.println(ans);
    }

    static int sod(int n)
    {
        int sum = 0;
        while(n>0)
        {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
