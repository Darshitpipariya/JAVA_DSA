package com.kunalKushwaha.firstjava;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        int first=0;
        int second=1;
        int next;
        for(int i=0;i<num;i++){
            if(i==0){
                System.out.print(first+" ");
            }
            else if (i==1){
                System.out.print(second+" ");
            }
            else{
                next=first+second;
                first=second;
                second=next;
                System.out.print(next+" ");
            }

        }
    }
}
