package com.amul;
import java.util.Scanner;

public class P9_MaxInArray {
    public static void main(String[] args)
    {
        int[] arr = {2,-11111,1000,5,6};
        System.out.println(max(arr));
    }

    static int max(int[] a)
    {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
                max = a[i];
        }
        return max;
    }
}
