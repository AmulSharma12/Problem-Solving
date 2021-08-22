package com.amul;
import java.util.Scanner;

//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
public class P5_Arithmetic_Operations {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input two numbers ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        char op = sc.next().trim().charAt(0);

        if(op == '+')
            System.out.println(a+b);
        if(op == '-')
            System.out.println(a-b);
        if(op == '*')
            System.out.println(a*b);
        if(op == '/')
            System.out.println(a/b);
    }

}
