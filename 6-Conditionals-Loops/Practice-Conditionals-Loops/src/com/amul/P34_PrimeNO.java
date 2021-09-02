package com.amul;
import java.util.Scanner;
//O(logn)
//O(log(logn)) --sieve

public class P34_PrimeNO {
    public static void main(String[] args)
    {
        for(int i=0; i<= 100;i++)
        {
            if(isPrime(i))
                System.out.println(i + " Prime");
            else
                System.out.println(i + " Not Prime");
        }
    }


    static boolean isPrime(int n)
    {
        if(n == 0 || n==1)
            return false;
        else
        {
            for(int i=2;i*i<=n;i++)
            {
                if(n%i==0)
                    return false;
            }
            return true;
        }

    }
}
