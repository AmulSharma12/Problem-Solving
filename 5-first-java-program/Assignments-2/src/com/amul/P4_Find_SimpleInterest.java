package com.amul;
import java.util.Scanner;

//WAP TO CALCULATE SIMPLE INTEREST
public class P4_Find_SimpleInterest {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int principle = sc.nextInt();
        int rate = sc.nextInt();
        int time = sc.nextInt();

        double si = (principle*rate*time)/100;
        System.out.println(si);

    }

}
