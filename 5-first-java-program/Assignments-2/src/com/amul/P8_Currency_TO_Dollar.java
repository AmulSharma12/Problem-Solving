package com.amul;
import java.util.Scanner;

//WAP TO CONVERT INDIAN RUPPES TO DOLLARS
public class P8_Currency_TO_Dollar {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        double ruppes = sc.nextDouble();

        double dollar;
        dollar = ruppes * 0.0134f;
        System.out.println(dollar);
    }
}
