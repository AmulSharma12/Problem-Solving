package com.amul;
import java.util.Scanner;

public class P11_Perimeter_Rectangle {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int width = sc.nextInt();
        int area = 2 * (length + width);
        System.out.println(area);

    }
}
