package com.amul;
import java.util.Scanner;

public class P4_MultiplyNo {
    public static void main(String [] args)
    {
        int result = mul();
        System.out.println(result);
    }
    static int mul()
    {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int mul = num1 * num2;
        return mul;
    }
}
