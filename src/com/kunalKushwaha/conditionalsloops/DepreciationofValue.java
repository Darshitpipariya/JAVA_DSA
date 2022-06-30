package com.kunalKushwaha.conditionalsloops;

import java.util.Scanner;

public class DepreciationofValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter original value: ");
        double oprice=sc.nextDouble();
        System.out.print("Enter current price: ");
        double cprice= sc.nextDouble();
        System.out.printf("Depreciation of value is %.2f",((oprice-cprice)/oprice)*100);
        System.out.println("%");
    }
}
