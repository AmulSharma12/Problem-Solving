package com.amul;
import java.util.*;

public class P26_DiscountOf_Product {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float price = sc.nextFloat();
        float realPrice = Discount(price);
        System.out.println(realPrice);
    }

    static float Discount(float op)
    {
        if(op >= 1000)
            return op -= 200;
        else if(op >= 2000)
            return op-= 300;
        else if(op >= 3000)
            return op -=500;

        return op;
    }
}
