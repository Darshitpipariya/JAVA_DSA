package com.kunalKushwaha.conditionalsloops;

import java.util.ArrayList;
import java.util.Scanner;

public class Factors {
//    for number n factor are the numbers from 1 to n which divides n
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    ArrayList<Integer> l=new ArrayList<>();
    for (int i=1;i<n;i++){
        if(n%i==0){
            l.add(i);
        }
    }
    System.out.println("Factors of "+n+" are "+l);
}
}
