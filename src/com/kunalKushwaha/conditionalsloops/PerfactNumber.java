package com.kunalKushwaha.conditionalsloops;

import java.util.ArrayList;
import java.util.Scanner;

public class PerfactNumber {
    static ArrayList<Integer> factors(int num){
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=1;i<=Math.sqrt(num);i++){
            if(num%i==0){
                l.add(i);
            }
        }
        return l;
    }
    static String check_perfect_num(int num){
        if(num==1){
            return "Perfect number";
        }
        ArrayList<Integer> factor=factors(num);

        int sum=0;
        for (int i:
             factor) {
            sum+=i;//sum of factors
        }
        return num==sum?"Perfect number":"not a perfect number";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int num=sc.nextInt();
        System.out.print("given num is "+check_perfect_num(num));
    }
}
