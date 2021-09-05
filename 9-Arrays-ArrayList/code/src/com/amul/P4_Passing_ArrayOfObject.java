package com.amul;
import java.util.Arrays;
import java.util.Scanner;

public class P4_Passing_ArrayOfObject {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String[] str = {"hi","bye","hello","go","react"};
        change(str);
        System.out.println(Arrays.toString(str));

    }
    static void change(String[] s)
    {
        s[0] = " 😁😁😁😁😁😁  Amul  😁😁😁😁😁😁 ";
    }
}
