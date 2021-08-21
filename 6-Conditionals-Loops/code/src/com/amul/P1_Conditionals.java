package com.amul;

public class P1_Conditionals {

    public static void main(String[] args) {
        /*
            Syntax for if statement
            if(boolean expression T or F){
                //body
            }
            else{
                //body
             }

        if true block followed by if statement execute
        if false block followed by else statement execute
         */


//        Example of if statement
//        int salary = 8000;
//        if(salary>10000)
//            salary = salary + 1000;
//        else
//            salary = salary +2000;
//        System.out.println(salary);

//        Multiple if statement
        int salary = 25000;
        if(salary>10000)
            salary += 2000;
        else if(salary>20000)
            salary += 3000;
        else
            salary += 1000;
        System.out.println(salary);

    }

}
