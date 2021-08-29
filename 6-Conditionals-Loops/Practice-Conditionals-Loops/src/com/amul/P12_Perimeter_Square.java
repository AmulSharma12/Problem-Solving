package com.amul;
import java.util.Scanner;

public class P12_Perimeter_Square {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int side =  sc.nextInt();
        int perimeter = 4 * side;
        System.out.println(perimeter);
    }
}
