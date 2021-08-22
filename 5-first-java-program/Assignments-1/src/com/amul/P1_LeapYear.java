package com.amul;
import java.util.Scanner;
public class P1_LeapYear {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

//        if(year%4 == 0)
//        {
//            if(year%100 == 0)
//            {
//                if(year%400 == 0)
//                    System.out.println("Leap Year");
//                else
//                    System.out.println("Not a Leap Year");
//            }
//            else
//           {
//                System.out.println("Leap Year");
//            }
//        }
//
//
//        else
//        {
//            System.out.println("Not A Leap Year");
//        }



        if(year%400==0 || (year%4==0 && year%100!=0))
            System.out.println("Leap Year");
        else
            System.out.println("Not a Leap Year");


    }

}
