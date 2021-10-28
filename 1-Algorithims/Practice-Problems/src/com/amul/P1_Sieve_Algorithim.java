package com.amul;
import java.util.Arrays;
import java.util.Scanner;

public class P1_Sieve_Algorithim {
    public static void main(String[] args)
    {
        int n = 100000;
        boolean []isPrime = new boolean[n];
        Arrays.fill(isPrime,true);
        createSieve(isPrime,n);
        Scanner sc = new Scanner(System.in);
        int query = sc.nextInt();
        while(query != 0)
        {
            n = sc.nextInt();
            System.out.println(isPrime[n]);
            query--;
        }
    }

    //Creating A Sieve
    static void createSieve(boolean isPrime[],int n)
    {
        isPrime[0]=isPrime[1] = false;
        for(int i=2;i<n;i++)
        {
            for(int j=2*i;j<n;j +=i){
                if(isPrime[j])
                    isPrime[j]=false;
            }
        }
    }

}
