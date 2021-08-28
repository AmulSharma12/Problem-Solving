package com.amul;
import java.util.Scanner;

//write a program to calculate area of a parallelogram
public class P5_Area_Parallelogram {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int height = sc.nextInt();

        int area = base * height;
        System.out.println(area);
    }

}
