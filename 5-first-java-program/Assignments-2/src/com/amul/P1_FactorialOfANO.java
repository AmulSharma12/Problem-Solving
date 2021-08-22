package com.amul;
import java.util.Scanner;

//WAP TO CALCULATE FACTORIAL OF A NUMBER
public class P1_FactorialOfANO {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int fac = -1;
        if(no == 0)
            fac = 1;
        else if(no<0)
            System.out.println("Cant Calculate Factorial Of NegativeNo");

        else{
            fac = 1;
            for(int i = 1;i<=no;i++)
            {
                fac = fac * i;
            }

        }
        System.out.println("factorial is " + fac);
    }

}
