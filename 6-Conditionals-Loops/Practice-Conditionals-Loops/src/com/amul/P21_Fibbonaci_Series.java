package com.amul;
import java.util.*;

public class P21_Fibbonaci_Series {
    public static void main(String[] args)
    {
        fibbonaci(8);

    }

    static void fibbonaci(int n)
    {
        int prev = 0;
        int curr = 1;
        int count = 2;
        System.out.println(prev);
        while(count<=n)
        {
            System.out.println(curr);
            int temp = curr;
            curr = prev + curr;
            prev = temp;
            count ++;

        }

    }
}
