package com.kunalKushwaha.flowofprogram;

import java.util.Scanner;

public class SumuntilX {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        while (true){
            String s=sc.next();
            if (!s.equals("x")) {
                sum+=Integer.parseInt(s);
            }
            else {
                break;
            }
        }
        System.out.println("Sum: "+sum);
    }
}
