package com.kunalKushwaha.flowofprogram;

import java.util.Scanner;
import java.util.SortedMap;

public class MutiplicationTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num: ");
        int multiplier= sc.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println(multiplier+" * "+i+" = "+(i*multiplier));
        }
    }
}
