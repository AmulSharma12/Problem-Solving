package com.amul;
import java.util.*;

public class P9_Scoping_ForLoop {
    public static void main(String[] args)
    {
//        if you declare variable inside for loop it scope remains in that for loop
//        only and you can modify that inside the scope but you cannot use access
//        outside the loop
        for(int i =1; i<=4; i++)
        {
            System.out.println(i);
        }
//        System.out.println(i); //--error
    }
}
