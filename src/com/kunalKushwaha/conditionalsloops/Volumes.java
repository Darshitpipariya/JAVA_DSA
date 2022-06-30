package com.kunalKushwaha.conditionalsloops;

import java.util.Scanner;

public class Volumes {
    static double pie=3.14;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("""
                1.Volume Of Cone Java Program
                2.Volume Of Prism
                3.Volume Of Cylinder
                4.Volume Of Sphere
                5.Volume Of Pyramid""");
        int Choice=sc.nextInt();
        double volume=0;
        switch (Choice){
            case 1->{
                System.out.print("Enter radius of base in cone: ");
                double radius= sc.nextDouble();
                System.out.print("Enter height of cone: ");
                double height=sc.nextDouble();
                volume=(1/3)*pie*Math.pow(radius,2)*height;
            }
            case 2->{
                System.out.print("Enter are of base: ");
                double area= sc.nextDouble();
                System.out.print("Enter height ");
                double height= sc.nextDouble();
                volume=area*height;
            }
            case 3->{
                System.out.print("Enter radius: ");
                double radius= sc.nextDouble();
                System.out.print("Enter height: ");
                double height=sc.nextDouble();
                volume=pie*Math.pow(radius,2);
            }
            case 4->{
                System.out.print("Enter radius: ");
                double radius= sc.nextDouble();
                volume=(4/3)*pie*Math.pow(radius,3);
            }
            case 5->{
                System.out.print("Enter base length: ");
                double blenght= sc.nextDouble();
                System.out.print("Enter base width: ");
                double bwidth= sc.nextDouble();
                System.out.print("Enter base height: ");
                double height= sc.nextDouble();
                volume=(blenght*bwidth*height)/3;
            }
        }

        System.out.printf("Volume: %.3f",volume);
    }
}
