package com.kunalKushwaha.functions;

import java.util.Scanner;

public class SumOfNnum {
    static int sum(int n){
        return n*(n+1)/2;//1+2+3+....+n=n(n+1)/2
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num:");
        int num=sc.nextInt();
        System.out.println("Sum of "+num+"is "+sum(num));
    }
}
