package com.amul;
import java.util.Scanner;

//write a program to area of a rectangle
public class P3_Area_Rectangle {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int width = sc.nextInt();

        int area = length * width;
        System.out.println(area);

    }

}
