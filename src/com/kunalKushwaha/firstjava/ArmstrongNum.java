package com.kunalKushwaha.firstjava;

import java.util.ArrayList;
import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int start=sc.nextInt();
        int end=sc.nextInt();
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=start;i<=end;i++){
            int temp=i;
            int arm=0;
            while(temp>0){
                arm+=Math.pow(temp%10,3);
                temp/=10;
            }
            System.out.println(arm);
            System.out.println(i);
            if(arm==i){
                l.add(i);
            }
        }
        System.out.println(l);
    }
}
