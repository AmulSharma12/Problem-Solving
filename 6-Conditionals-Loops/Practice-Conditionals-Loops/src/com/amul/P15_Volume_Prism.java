package com.amul;
import java.util.Scanner;

public class P15_Volume_Prism {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int height = sc.nextInt();
        int vol = base * height;
        System.out.println(vol);
    }
}
