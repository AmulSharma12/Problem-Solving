package com.amul;
import java.util.Scanner;

//wap to area of a circle
public class P1_Area_Circle {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();
        float area = 3.14f*r*r;
        System.out.println(area);
    }
}
