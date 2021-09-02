package com.amul;
import java.util.*;

public class P33_ReverseString {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String reverse = "";

        for(int i=s.length()-1;i>=0;i--)
        {
            reverse = reverse + (s.charAt(i));
        }

        System.out.println(reverse);
    }
}
