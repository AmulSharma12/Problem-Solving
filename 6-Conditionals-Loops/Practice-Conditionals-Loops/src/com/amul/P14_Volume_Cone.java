package com.amul;
import java.util.Scanner;
//pie(r^2)h/3
public class P14_Volume_Cone {
    float pie = 3.14f;
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    int h = sc.nextInt();

    double vol = pie * (Math.pow(r,2))* (h)/3;



}
