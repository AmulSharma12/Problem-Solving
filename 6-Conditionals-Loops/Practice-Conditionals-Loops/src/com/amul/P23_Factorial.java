package com.amul;
import java.util.Scanner;

//factorial program in java
public class P23_Factorial {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int factorial = fac(no);
        System.out.println(factorial);
    }

    static int fac(int n)
    {
        if(n == 0)
            return 1;
        else if(n<0)
            return -1;
       else
        {
            int fac = 1;
            while(n>0)
            {
                fac *= n;
                n--;
            }
            return fac;
        }
    }
}
