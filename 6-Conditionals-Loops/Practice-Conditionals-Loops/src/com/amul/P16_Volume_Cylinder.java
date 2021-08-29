package com.amul;
import java.util.Scanner;
import java.lang.System;
public class P16_Volume_Cylinder {
    public static void main(String[] args)
    {
        double pie = Math.PI;
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextInt();
        double height = sc.nextInt();

        double vol = pie * (radius*radius) * height;
        System.out.println(vol);
    }
}
