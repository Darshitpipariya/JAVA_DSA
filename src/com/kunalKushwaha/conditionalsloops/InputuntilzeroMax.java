package com.kunalKushwaha.conditionalsloops;

import java.util.Scanner;

public class InputuntilzeroMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num other than zeros: ");
        int i=sc.nextInt();
        int max=i;
        while (i != 0){
            max=Math.max(max, i);
            i= sc.nextInt();
        }
        System.out.println("Max: "+max);
    }
}
