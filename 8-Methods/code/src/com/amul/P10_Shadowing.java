package com.amul;
import java.util.*;

public class P10_Shadowing {
    static int x = 10;  // class variable
    public static void main(String[] args)
    {
        System.out.println(x);
        int x ;//when a local variable declared it will  shadow class variables

//        System.out.println(x); //--error
//        ->because at declaration of local variable class variable shadowed
//        ->and scope of local variable will start when it is initialised
//        ->currently class variable shadowed and local variable x not initialised also


        x = 100;  //after initialisation it scope to access is valid
        System.out.println(x);
    }
}
