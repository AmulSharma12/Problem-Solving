package com.amul;
import java.util.Scanner;
import java.util.Arrays;
public class P2_Input_Array_Object {
    public static void main(String[] args)
    {
//        It is basically an array of refernce variable pointing to objects present anywhere in heap
        Scanner sc = new Scanner(System.in);
        String[] str  = new String[5];
        for(int i=0;i<str.length;i++)
        {
            str[i] = sc.next();
        }

        System.out.println(Arrays.toString(str));
    }
}
