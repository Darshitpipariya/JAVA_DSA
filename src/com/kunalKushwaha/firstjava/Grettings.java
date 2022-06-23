package com.kunalKushwaha.firstjava;

import java.util.Scanner;

public class Grettings {
    static void grettings(String name){
        System.out.println("Hello "+name+" !");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        grettings(sc.nextLine());
    }
}
