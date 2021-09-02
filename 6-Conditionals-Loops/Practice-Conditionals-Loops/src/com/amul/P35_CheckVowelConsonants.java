package com.amul;
import java.util.*;

public class P35_CheckVowelConsonants {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);
        if(ch=='a' || ch=='e' || ch=='i' ||ch=='o' ||ch=='u' ||ch=='A' ||ch=='E'
        || ch=='I' ||ch=='O' ||ch=='U')
            System.out.println(ch + " Vowel");
        else
            System.out.println(ch + " Consonant");
    }
}
