package com.kunalKushwaha.flowofprogram;

import java.util.Scanner;

public class Findleapyear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        if((input%4==0 && input%100!=0) ||input%400==0){
            System.out.println("given year is leap year");
        } else {
            System.out.println("not Leap year");
        }
    }
}
