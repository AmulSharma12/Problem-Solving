package com.amul;
import java.util.Scanner;

public class P1_Greeting {
    public static void main(String [] args)
    {
//   value return from where method call depend upon returnType of methodcall
        String s = greet();
        System.out.println(s);
    }

//    returning the string return statement encountered it will exit method
    static String greet()
    {
        String greeting = "Nice";
        return greeting;
    }
}
