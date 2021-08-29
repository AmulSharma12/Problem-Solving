package com.amul;
import java.util.*;

public class P8_Perimeter_Circle {
    public static void main(String [] args)
    {
        final double pie = 3.14;
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        double perimeter = 2 * pie * radius;
        System.out.println(perimeter);
    }
}
