package com.kunalKushwaha.conditionalsloops;

import java.util.Scanner;

public class DigitProSumsubstraction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter int: ");
        int num=sc.nextInt();
        int sum=0;
        int mul=1;
        int digit;
        while(num>0){
            digit=num%10;
            sum+=digit;
            mul*=digit;
            num/=10;
        }
        System.out.println("Diffrence:"+(mul-sum));
    }
}

