package com.amul;
import java.util.*;

public class P19_CurvedSurfaceArea_Cylinder {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double pie = 3.14;
        int radius = sc.nextInt();
        int height = sc.nextInt();

        double csa = 2 * pie * radius * height;
        System.out.println(csa);
    }

}
