package com.kunalKushwaha.firstjava;

import java.util.Currency;
import java.util.Scanner;

public class INRtoUSD {
    static int Exchange_rate_inr_to_usd=78;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Rupee");
        int Rupee= sc.nextInt();
        int USD;
        USD = Rupee*Exchange_rate_inr_to_usd;
        System.out.println(Rupee+" INR : "+USD+" USD");
    }
}
