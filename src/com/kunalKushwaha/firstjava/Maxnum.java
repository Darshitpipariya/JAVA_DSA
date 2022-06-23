package com.kunalKushwaha.firstjava;

import java.util.Scanner;

public class Maxnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1=sc.nextInt();
        System.out.println("Enter num2: ");
        int num2=sc.nextInt();
        System.out.println("Max no: "+ (num1>num2?num1:num2));
    }
}
