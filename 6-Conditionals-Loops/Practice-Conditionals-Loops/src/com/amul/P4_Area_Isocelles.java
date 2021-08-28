package com.amul;
import java.util.Scanner;

//write a program to calculate area of a Isocelles triangle
public class P4_Area_Isocelles {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        float base = sc.nextFloat();
        float height = sc.nextFloat();

        float area = (base*height)/2;
        System.out.println(area);
    }
}
