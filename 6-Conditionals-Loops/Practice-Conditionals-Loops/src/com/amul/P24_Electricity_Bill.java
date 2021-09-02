package com.amul;
import java.util.*;

public class P24_Electricity_Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int unit = sc.nextInt();
        int bill = ElectricityBill(unit);
        System.out.println(bill);
    }


    static int ElectricityBill(int unit) {
        if (unit > 0) {
            if (unit == 100) {
                System.out.println("Free");
                return 0;
            } else if (unit > 100 && unit <= 200) {
                return 20 * unit;
            } else if (unit > 200 && unit <= 300) {
                return 30 * unit;
            } else {
                return 40 * unit;
            }
        }

        else
            return 0;
    }
}
