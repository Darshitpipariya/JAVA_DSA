package com.kunalKushwaha.conditionalsloops;

import java.util.Scanner;

public class BillCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter units used: ");
        int units= sc.nextInt();
        int remaining_units;
        double charge=0;
        if(units>250){
            remaining_units=units-250;
            charge+=(remaining_units*4.9);
            units=units-remaining_units;
        }
        if (units>100) {
            remaining_units=units-100;
            charge+=(remaining_units*3.75);
            units=units-remaining_units;

        }
        if (units>50) {
            remaining_units=units-50;
            charge+=(remaining_units*3.10);
            units=units-remaining_units;
        }

        if(units<=50){
            remaining_units=units;
            charge+=(remaining_units*2.65);
        }
        System.out.println("Elecricity bill:- "+charge);

    }
}
