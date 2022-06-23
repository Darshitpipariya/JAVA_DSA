package com.kunalKushwaha.firstjava;

import java.util.Scanner;

public class StringPalindroma {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        boolean flag=true;
        int str_len=str.length();
        for(int i=str_len-1;i>=0;i--){
            if(str.charAt(i)!=str.charAt((str_len-1)-i)){
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("not palindrome");
        }
    }
}
