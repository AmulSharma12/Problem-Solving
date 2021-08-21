package com.amul;
import java.util.Scanner;
public class P6_Q_InNo_CountDigit {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int no = sc.nextInt();
        System.out.println("Enter a digit ");
        int dig = sc.nextInt();
        int nod = 0,temp;

        while(no > 0)
        {
  //     in case if last no otained each time  by modulo is equal to dig we increase count
            temp = no % 10;
            if(temp == dig)     nod ++;
            no = no / 10;
        }
        System.out.println(nod);
    }
}
