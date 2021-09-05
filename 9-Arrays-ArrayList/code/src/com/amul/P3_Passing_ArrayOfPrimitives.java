package com.amul;
import java.util.Scanner;

public class P3_Passing_ArrayOfPrimitives {
    public static void main(String[] args)
    {
//        In Arrays Of Primitives whenever you call method by passing
//        Array of Primitives the value modified in the method
//        will reflect on the original object
//        Because both are pointing to same object
//        arr --------> {x,x,x,x,x}
//        int[] nums = arr;
//        nums--------->{x,x,x,x,x}
        Scanner sc = new Scanner(System.in);
        int[] arr  = new int[5];
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);
    }

    static void change(int[] nums)
    {
        nums[0] = 100;
    }

//    Conclusion If Both are pointing to the same object then it will
//    reflect in the original object
}
