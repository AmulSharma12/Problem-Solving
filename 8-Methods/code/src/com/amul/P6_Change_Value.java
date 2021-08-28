package com.amul;
import java.util.*;

public class P6_Change_Value {
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5};
        changeValue(arr);
        System.out.println(Arrays.toString(arr));
    }

//    if you make change in object by this reference variable same object will be changed
    static void changeValue(int[] nums)
    {
        nums[0] = 45;
    }
}
