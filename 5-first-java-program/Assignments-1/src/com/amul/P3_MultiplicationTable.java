package com.amul;
import java.util.Scanner;
public class P3_MultiplicationTable {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int i = 1;

        while(i<=10)
        {
            System.out.println(no +" x "+ i +" = "+no*i);
            i++;
        }
    }

}
