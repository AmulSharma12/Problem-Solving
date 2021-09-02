package com.amul;
import java.util.Scanner;

//Average of a n numbers
public class P25_AverageOfN_Numbers {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers you wanna enter ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=n;i++)
        {
//            int [i] a= sc.nextInt();
        }

        double avg = sum / n;
        System.out.println(avg);

    }

}
