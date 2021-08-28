package com.amul;
import java.util.*;

public class P14_PrimeNo_Method {
    public static void main(String[] args)
    {
        System.out.println(isPrime(13));
    }

    static boolean isPrime(int n){
        if(n<=1)
            return false;
        int i=2;
        while(i*i<=n)
        {
            if(n%i==0)
                return false;
            i++;
        }
        return i*i>n;
    }
}
