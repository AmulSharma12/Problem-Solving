package com.amul;
import java.util.Scanner;

//write a program to print the largest among two numbers
public class P6_Largest_AmongTwoNumbers {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();

        if(first>second)
            System.out.println(first +  " is greater ");
        else
            System.out.println(second + "  is greater");
    }
}
