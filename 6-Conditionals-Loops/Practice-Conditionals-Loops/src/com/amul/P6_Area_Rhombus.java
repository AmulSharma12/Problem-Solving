package com.amul;
import java.util.Scanner;

//write a program to calculate area of a rhombus
public class P6_Area_Rhombus {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
//        int diag1 = sc.nextInt();
//        int diag2 = sc.nextInt();
//
//        int area = (diag1*diag2)/2;
//        System.out.println(area);

        int base = sc.nextInt();
        int height = sc.nextInt();

        int area = base * height ;
        System.out.println(area);
    }
}


