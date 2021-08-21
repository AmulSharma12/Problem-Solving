package com.amul;
import java.util.Scanner;
public class P4_Q_CharCaseCheck {
    public static void main(String [] args)
    {
//        Input a character and whether it is uppercase and lowercase

        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);
//        from a word give character at index 0 trim means remove extra spaces

        if(ch >= 'a' && ch <= 'z')
            System.out.println("LowerCase");
        else
            System.out.println("UpperCase");
    }
}
