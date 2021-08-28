package com.amul;
import java.util.*;

public class P12_Overloading {
    public static void main(String[] args)
    {
        fun(8);
        fun("ok");
        fun(8,"amulop");


//        at compile time it will decide which one to run
    }
//    Method Overloading is a method with same name that will exist if
//    if the parameter is different
    static void fun(int a)
    {
        System.out.println(a);
    }
    static void fun(String name)
    {
        System.out.println(name);
    }

//    and no of parameter different
    static void fun(int a,String name)
    {
        System.out.println(a + " " + name);
    }


//    while overloading the varargs it should be  must to pass atleast one
//    arguments otherwise there will be ambiguity
    static void  demo(int ...v)
    {
        System.out.println(v);
    }
    static void demo(String ...name)
    {
        System.out.println(name);
    }
}
