package com.amul;
import java.util.Scanner;
import java.util.Arrays;

//https://leetcode.com/problems/concatenation-of-array/
public class P2_LeetCode1929 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i] = sc.nextInt();
        }
        int[] result = getConcatenation(nums);
        System.out.println(Arrays.toString(result));
    }

    public static int[] getConcatenation(int[] nums)
    {
        int[] ans = new int[2*(nums.length)];
        int n = nums.length;
        for(int i=0;i<nums.length;i++)
        {
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        return ans;
    }
}
