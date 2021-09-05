package com.amul;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

//Basially it is arraylist of arraylist for any no of size
public class P7_MultiDimensional_ArrayList {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
//        Created empty arraylist
        ArrayList<ArrayList<Integer>> ds = new ArrayList<>();

//        Initialisation
        for(int i=0;i<3;i++)
            ds.add(new ArrayList<>());


//        Taking input from user
            for(int i=0;i<3;i++) {
                for (int j = 0; j < 3; j++) {
                    ds.get(i).add(sc.nextInt());
                }
            }


//            Printing result
        System.out.println(ds);


    }

}
