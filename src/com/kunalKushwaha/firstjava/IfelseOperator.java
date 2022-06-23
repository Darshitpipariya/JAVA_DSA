package com.kunalKushwaha.firstjava;

import java.util.Scanner;

public class IfelseOperator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("input operator + ,- ,* , /");
        String opr=sc.nextLine();
        System.out.println("enter num1: ");
        double num1=sc.nextDouble();
        System.out.println("enter num2: ");
        double num2= sc.nextDouble();

        if(opr.equals("+")){
            System.out.println(num1+" + "+num2+" = "+(num1+num2));
        } else if (opr.equals("-")) {
            System.out.println(num1+" - "+num2+" = "+(num1-num2));
        }else if (opr.equals("*")) {
            System.out.println(num1+" * "+num2+" = "+(num1*num2));
        }else if (opr.equals("/")) {
            System.out.println(num1+" / "+num2+" = "+(num1/num2));
        }
    }
}
