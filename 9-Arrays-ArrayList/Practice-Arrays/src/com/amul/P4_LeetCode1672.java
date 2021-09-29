package com.amul;
import java.util.*;
//https://leetcode.com/problems/richest-customer-wealth/

public class P4_LeetCode1672 {
    public static void main(String[] args)
    {

        int[][] accounts = {{1,5},{7,3},{3,5}};
          int result =  maximumWealth(accounts);
          System.out.println(result);
    }

    public static int maximumWealth(int[][] accounts)
    {
        int[] sum = new int[accounts.length];
        int wealth = 0;
        for(int i = 0;i<accounts.length;i++)
        {
            for(int j=0;j<accounts[i].length;j++)
                sum[i] += accounts[i][j];

            if(sum[i]>wealth)
                wealth = sum[i];
        }
        return wealth;
    }
}
