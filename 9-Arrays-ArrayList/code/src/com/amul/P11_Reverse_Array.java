package com.amul;
import java.util.Scanner;
import java.util.Arrays;

public class P11_Reverse_Array {
    public static void main(String[] args)
    {
        int[] arr = {2,4,57,8,8};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }


    //reverse method
    static void reverse(int[] a)
    {
        int start = a[0];
        int end = a.length-1;
        while(start<end)
        {
            swap(a,start,end);
            start++;
            end--;
        }
    }

    //swap method
    static void swap(int[] a,int index1,int index2)
    {
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }
}
