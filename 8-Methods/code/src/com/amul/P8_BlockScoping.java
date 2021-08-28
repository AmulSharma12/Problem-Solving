package com.amul;
import java.util.*;

public class P8_BlockScoping {
    public static void main(String[] args)
    {
//            The value initialised in the block will remain in the block
        int num1 = 4;
        int num2 = 6;
        {
//            int num1 = 6;  //cannot redeclared the same variable
            num1 = 67;
            int num3 = 5;  //variable declaraed inside the block its scope remain in block
        }

//        cannot used outside the block c
//        System.out.println(c);  //--error
    }

}
