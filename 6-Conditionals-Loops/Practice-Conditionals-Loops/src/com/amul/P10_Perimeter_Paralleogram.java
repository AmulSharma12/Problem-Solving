package com.amul;
import java.util.Scanner;

public class P10_Perimeter_Paralleogram {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        int area = 2*(length + breadth);
        System.out.println(area);
    }
}
