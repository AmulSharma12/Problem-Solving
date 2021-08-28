package com.amul;
import java.util.Scanner;

public class P3_SumTwoNumber {
    public static void main(String[] args)
    {
        sum1();
        int result = sum2();
        System.out.println(result);
    }

//    doesnot return any type that means write void
    static void sum1()
    {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println(sum);
    }

//    if you return something then same as the return type data return it
    static int sum2()
    {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = num1 +num2;
        return sum ;
    }
}
