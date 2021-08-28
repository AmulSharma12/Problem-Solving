package com.amul;
import java.util.*;

//VarArgs is basically passing variable no of arguments
public class P11_VarArgs {
    public static void main(String[] args)
    {
        fun(1,2,3,34,5,5,5,6,2,3,4);
        fun();
        multiple(1,2,"harry","amul");
    }

//    Internally it is taken as array of integers
    static void fun(int ...v)
    {
        System.out.println(Arrays.toString(v));
    }


//    TO mix arguments
//    varargs should be the last at arguments
    static void multiple(int a ,int b ,String ...x)
    {

    }


}
