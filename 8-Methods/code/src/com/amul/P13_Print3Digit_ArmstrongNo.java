package com.amul;
import java.util.*;

public class P13_Print3Digit_ArmstrongNo {
    public static void main(String[] args)
    {
//        boolean ans = isArmstrong(154);
//        System.out.println(ans);

        for(int i=100;i<999;i++)
        {
            if(isArmstrong(i))
                System.out.println(i);
        }
    }

    static boolean isArmstrong(int n)
    {
        int original = n;
        int sum = 0;

        while(n>0)
        {
            int rem = n%10;
            n = n/10;
            sum = sum + rem*rem*rem;
        }
        return sum==original;
    }
}
