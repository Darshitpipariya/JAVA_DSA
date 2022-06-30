package com.kunalKushwaha.conditionalsloops;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder str= new StringBuilder(sc.nextLine());
        System.out.println(str.reverse());
//        OR

//        StringBuilder strreverce= new StringBuilder();
//        int strlen=str.length();
//        for (int index= strlen-1;index>=0;index--){
//            strreverce.append(str.charAt(index));
//        }
//        System.out.println(strreverce);
    }
}
