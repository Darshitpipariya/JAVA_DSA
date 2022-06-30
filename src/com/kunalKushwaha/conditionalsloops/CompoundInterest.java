package com.kunalKushwaha.conditionalsloops;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Principle Amount:");
        double Amount=sc.nextDouble();
        System.out.print("Enter interest rates:");
        double Interest_rates_yearly=sc.nextDouble();
        double Interest_rates_months=Interest_rates_yearly/1200;
        System.out.println("Enter time in terms of months:");
        double Time= sc.nextDouble();
        while (Time>0){
            Amount+=(Amount*Interest_rates_months);
            Time--;
        }
        System.out.printf("Amount to be paid: %.3f",Amount);
    }
}
