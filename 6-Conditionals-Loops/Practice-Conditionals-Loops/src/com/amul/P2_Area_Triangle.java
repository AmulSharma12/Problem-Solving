package com.amul;
import java.util.Scanner;

//write a program to calculate area of a triangle
public class P2_Area_Triangle {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int height = sc.nextInt();
        float area;

        area = (base*height)/2.0f;
        System.out.println(area);
    }
}
