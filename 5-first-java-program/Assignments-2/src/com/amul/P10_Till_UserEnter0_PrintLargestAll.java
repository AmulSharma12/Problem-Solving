package com.amul;
import java.util.Scanner;

//input till user enter 0 and print the largest among all these numbers
public class P10_Till_UserEnter0_PrintLargestAll {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int max=Integer.MIN_VALUE;
        int user ;

        while(true)
        {
            user = sc.nextInt();
            if (user == 0)
                break;
            else
            {
                if(user>max)    max = user;
            }
        }

        System.out.println(max);
    }
}
