package com.kunalKushwaha.flowofprogram;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class TwoNumbersum {
    public static void main(String @NotNull [] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter num1: ");
//        int num1= sc.nextInt();
//        System.out.print("Enter num2: ");
//        int num2= sc.nextInt();
//        System.out.println("\n Sum= "+(num1+num2));
        System.out.println("Sum= "+(Integer.parseInt(args[0])+Integer.parseInt(args[1])));
    }
}
