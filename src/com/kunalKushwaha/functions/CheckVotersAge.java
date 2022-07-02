package com.kunalKushwaha.functions;

import java.util.Scanner;

public class CheckVotersAge {
    static String checkage(int age){
        return age>=18?"Eligible":"Not Eligible";
    }
    public static void main(String[] args) {
        System.out.print("Enter age:");
        Scanner sc = new Scanner(System.in);
        int age= sc.nextInt();
        System.out.print(checkage(age));

    }
}
