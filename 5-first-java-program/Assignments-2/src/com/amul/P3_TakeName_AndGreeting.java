package com.amul;
import java.util.Scanner;

//TAKE NAME AS INPUT AND PRINT GREETING MESSAGE WITH NAME
public class P3_TakeName_AndGreeting {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Greeting Mr."+s);
    }

}
