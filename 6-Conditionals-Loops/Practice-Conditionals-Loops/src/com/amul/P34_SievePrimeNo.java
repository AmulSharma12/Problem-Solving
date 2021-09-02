//package com.amul;
//import java.util.*;
//import java.util.Arrays;
//
//public class P34_SievePrimeNo {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for (int i = 0; i < n; i++) {
//            if (checkPrime(i))
//                System.out.println(i + " Prime");
//            else
//                System.out.println(i + " Not Prime");
//        }
//    }
//
//    static boolean checkPrime(int n)
//    {
//        boolean isPrime[] = new boolean[n];
//        Arrays.fill(isPrime, true);
//        isPrime[0] = isPrime[1] = true;
//        for (int i = 2; i <= n; i++)
//        {
//            for (int j = 2 * i; j <= n; j = j + i)
//            {
//                if (isPrime[j])
//                    isPrime[j] = false;
//            }
//        }
//
//    }
//}