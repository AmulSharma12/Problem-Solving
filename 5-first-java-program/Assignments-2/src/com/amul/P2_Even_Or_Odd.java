package com.amul;
import java.util.Scanner;

//Write A PROGRAM TO TAKE A NUMBER AND PRINT EVEN OR ODD
public class P2_Even_Or_Odd {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2 == 0)
            System.out.println("Even");
        else
            System.out.println("odd");
    }
}
