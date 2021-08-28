package com.amul;
import java.lang.Math;
import java.util.Scanner;

//write a program to calculate area of a eqilateral
public class P7_Area_Equilateral {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();

        double area = (Math.sqrt(3)/4)*side*side;
        System.out.println(area);
    }
}
