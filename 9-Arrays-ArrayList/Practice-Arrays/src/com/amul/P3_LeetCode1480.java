package com.amul;
import java.util.Scanner;
import java.util.Arrays;
//https://leetcode.com/problems/running-sum-of-1d-array/
public class P3_LeetCode1480 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []nums = new int[n];
        for(int i=0;i<nums.length;i++)
        {
            nums[i] = sc.nextInt();
        }
        int []result = runningSum(nums);
        System.out.println(Arrays.toString(result));
    }

    public static int[] runningSum(int[] nums)
    {
        int[] runSums = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(i==0)
            {
                runSums[i] = nums[i];
                continue;
            }
            runSums[i] = nums[i] + runSums[i-1];
        }
        return runSums;
    }
}
