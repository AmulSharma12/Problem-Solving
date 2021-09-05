package com.amul;
import java.util.*;

public class P1_Input_Array_Primitive {
    public static void main(String[] args)
    {
//        Array of primitives
//        Primitives are something cannot be broken down further
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0 ; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

//        Printing normally by a for loop
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }


//        Using Enhanched For Loop
        for(int element : arr)
        {
            System.out.println(element);
        }


//        Using Arrays method toString
//        convert entire array into string and print it
        System.out.println(Arrays.toString(arr));
    }

}
