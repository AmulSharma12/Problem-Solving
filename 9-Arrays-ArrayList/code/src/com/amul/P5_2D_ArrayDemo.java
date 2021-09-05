package com.amul;
import java.util.Arrays;
import java.util.Scanner;

public class P5_2D_ArrayDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        Synatax
//        int[][] arr1 = new int[3][3];
//        int[][] arr2 = {
//                {1,2,3},
//                {4,5,6},
//                {6,7,8}
//        };

        //rows are mandatory
//        int[][] arr = new int[4][4];
        //columuns are optional
        int[][] arr = new int[4][3];

        //size of array is equal to no of rows
        System.out.println(arr.length);

//        Taking Input From Array
//        for(int row = 0; row <arr.length;row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//               arr[row][col] = sc.nextInt();
//            }
//        }


        //Printing in an array
//        for(int row = 0; row <arr.length;row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();

//            variable length of column
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row][col]; col++) {
                arr[row][col] = sc.nextInt();
            }

        }


//            Printing all the array numbers
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");

            }
            System.out.println();
        }


        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));


        }
    }
}