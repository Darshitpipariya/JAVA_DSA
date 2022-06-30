package com.kunalKushwaha.conditionalsloops;


import java.util.Scanner;

public class CalculateDiscountedPrice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Original price: ");
        double P=sc.nextDouble();
        System.out.print("Enter discount: ");
        float D=sc.nextFloat();
        System.out.printf("Final price %.2f",(P-(P*D/100)));
    }
}
