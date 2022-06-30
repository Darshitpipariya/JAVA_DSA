package com.kunalKushwaha.conditionalsloops;

import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int num=sc.nextInt();
        long fact = 1;
        int temp=num;

        while (temp>=1){
            fact*=temp--;
        }
        System.out.println("factorial of "+num+" is "+fact);
    }
}
