package com.kunalKushwaha.conditionalsloops;

import java.util.Scanner;

public class CheckPalindrome {
    static boolean palindrome_or_not(String s){
        StringBuilder revstr=new StringBuilder(s);
        String r=revstr.reverse().toString();
        return s.equals(r);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value to check if palindrome or not:");
        System.out.println(palindrome_or_not(sc.nextLine()));
    }
}
