package com.amul;
import java.util.*;

public class P27_DistanceBetween_2Points {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter Ordinates of one poinnt");
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();

        System.out.println("enter Ordinates of second poinnt");
        int y1 = sc.nextInt();
        int y2 = sc.nextInt();

        int ra = x2-x1;
        int ry = y2-y1;
        ra = ra * ra;
        ry = ry*ry;

        int result = (int)Math.sqrt((ra-ry));
        System.out.println(result);
    }
}
