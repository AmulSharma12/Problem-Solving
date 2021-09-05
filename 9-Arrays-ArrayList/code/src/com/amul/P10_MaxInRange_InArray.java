package com.amul;
import java.util.Scanner;

public class P10_MaxInRange_InArray {
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,5,7};
        System.out.println(max(arr,0,3));
    }

    //max in range of an array
    static int max(int[]arr,int start,int end)
    {
        int  max = arr[start];
        for(int i=start;i<=end;i++)
        {
            if(arr[i]>max)
                max = arr[i];
        }
        return max;
    }


}
