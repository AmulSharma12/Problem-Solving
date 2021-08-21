package com.amul;
import java.util.*;
public class P3_NestedSwitchDemo {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int empId = sc.nextInt();
        String dept = sc.next();

        switch(empId){
            case 1:
                System.out.println("Amul Sharma");
                break;
            case 2:
                System.out.println("AMul Op");
            case 3:
                switch(dept){
                    case "IT" :
                        System.out.println("It");
                        break;
                    case "CS":
                        System.out.println("cs");
                        break;
                    default:
                        System.out.println("Invalid dept");
                };
                break;
            default:
                System.out.println("Invalid employee id");

        }
    }
}
