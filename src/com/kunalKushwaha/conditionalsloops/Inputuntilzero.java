package com.kunalKushwaha.conditionalsloops;

import java.util.Scanner;
//Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
public class Inputuntilzero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num other than zeros: ");
        int i=sc.nextInt();
        int sum=0;
        while (i != 0){
            sum+=i;
            i= sc.nextInt();
        }
        System.out.println("Sum: "+sum);

    }
}
