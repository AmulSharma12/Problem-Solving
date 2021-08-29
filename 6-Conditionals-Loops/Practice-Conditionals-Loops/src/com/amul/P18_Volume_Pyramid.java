package com.amul;
import java.util.Scanner;

public class P18_Volume_Pyramid {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        double vol = (l*w*h)/3;
        System.out.println(vol);

    }
}
