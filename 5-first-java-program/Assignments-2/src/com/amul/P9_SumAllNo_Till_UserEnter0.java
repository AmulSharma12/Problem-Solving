package com.amul;
import java.util.Scanner;

//Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
public class P9_SumAllNo_Till_UserEnter0 {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int user,sum=0;
        while(true)
        {
            user = sc.nextInt();
            if(user == 0)
                break;
            else
            {
                sum += user;
            }
        }
        System.out.println(sum);
    }
}
