package com.amul;
import java.util.*;

public class P28_Power_InJava {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int no = in.nextInt();
        int ans = pow(no);
        System.out.println(ans);

    }


    static int pow(int n)
    {
        n = (int) Math.pow(n,2);
        return n;
    }
}
