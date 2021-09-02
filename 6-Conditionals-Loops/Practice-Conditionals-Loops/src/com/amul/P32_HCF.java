package com.amul;
import java.util.Scanner;

public class P32_HCF {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int hcf = hcf(n1,n2);
        System.out.println(hcf);
        
    }

    static int hcf(int a,int b)
    {
        int rem;
        while(a%b !=0)
        {
            rem = a%b;
            a = b;
            b = rem;
        }
        return b;
    }
}
