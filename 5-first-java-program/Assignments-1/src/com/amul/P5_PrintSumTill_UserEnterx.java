package com.amul;
import java.util.Scanner;

//Print sum of all the no till the user enter x

public class P5_PrintSumTill_UserEnterx {
    public static void main(String [] args)
    {
        int sum = 0;
        while(true)
        {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            if(s.equals("x"))
                break;
            else
            {
                sum += Integer.valueOf(s);
            }

        }
        System.out.println("sum is " + sum );

    }

}
