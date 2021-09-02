package com.amul;
import java.util.Scanner;

public class P30_CheckLeapYear {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        boolean ans = checkLeap(year);
        System.out.println(ans);
    }

    static boolean checkLeap(int y)
    {
         if(y%4 == 0)
         {
             if(y%100 == 0)
             {
                 if(y%400== 0)
                     return true;
                 else
                     return false;
             }
             else
                return true;
         }
         else
            return false;
    }
}
