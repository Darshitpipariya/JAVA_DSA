package com.kunalKushwaha.firstjava;

//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest

import java.util.Scanner;
import java.util.SortedMap;

public class Simpalinterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Principal amount");
        double Principal=sc.nextDouble();
        System.out.println("Enter time in months");
        int time= sc.nextInt();
        System.out.println("Enter interest");
        double rateofinterest=sc.nextDouble();
        double amount=Principal+(Principal*(rateofinterest/(12*100)))*time;
        System.out.println("Amount to be paid: "+ amount);
    }
}
