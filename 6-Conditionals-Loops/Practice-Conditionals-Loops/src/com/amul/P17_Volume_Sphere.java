package com.amul;
import java.util.Scanner;

public class P17_Volume_Sphere {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double pie = Math.PI;
        int radius  = sc.nextInt();
        double vol = (4/3) * pie * (radius*radius*radius);
        System.out.println(vol);
    }
}
