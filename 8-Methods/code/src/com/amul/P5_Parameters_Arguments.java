package com.amul;
import java.util.Scanner;

public class P5_Parameters_Arguments {
    public static void main(String [] args)
    {
//        System.out.println("Enter a no :");
        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        int sum = sum(a,b);
//        System.out.println(sum);


        String name = sc.nextLine();
        String done = greet(name);
        System.out.println(done);

    }

    static int sum(int x ,int y )
    {
        int sum = x+y;
        return sum;
    }

    static  String greet(String name){
        String message = "hello " + name;
        return message;
    }
}
