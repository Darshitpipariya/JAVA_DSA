package com.kunalKushwaha.conditionalsloops;

import java.util.Scanner;

public class Area {
    static double pie=3.14;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("""
                CHOOSE OPTION:
                1.Area Of Circle Java Program
                2.Area Of Triangle
                3.Area Of Rectangle Program
                4.Area Of Isosceles Triangle
                5.Area Of Parallelogram
                6.Area Of Rhombus
                7.Area Of Equilateral Triangle
                8.Curved Surface Area Of Cylinder
                9.Total Surface Area Of Cube""");
        int choice=sc.nextInt();
        double area=0;

        switch (choice) {
            case 1 -> {
                System.out.print("Enter radius: ");
                double radius = sc.nextDouble();
                area = pie * Math.pow(radius, 2);
            }
            case 2,4->{
                System.out.print("Enter base: ");
                double base = sc.nextDouble();
                System.out.print("Enter height: ");
                double height = sc.nextDouble();
                area = (height*base)/2;
            }
            case 3->{
                System.out.print("Enter len of side: ");
                double len= sc.nextDouble();
                area = len*len;
            }
            case 5->{
                System.out.print("Enter base: ");
                double base = sc.nextDouble();
                System.out.print("Enter height: ");
                double height = sc.nextDouble();
                area = (height*base);
            }
            case 6->{
                System.out.print("Enter Diagonal1: ");
                double Diagonal1 = sc.nextDouble();
                System.out.print("Enter Diagonal2: ");
                double Diagonal2 = sc.nextDouble();
                area = (Diagonal1*Diagonal2);
            }
            case 7->{
                System.out.print("Enter Side: ");
                double Side = sc.nextDouble();
                area = (Math.sqrt(3)/4)*Side;
            }
            case 8->{
                System.out.print("Enter radius: ");
                double radius= sc.nextDouble();
                System.out.print("Enter height: ");
                double height= sc.nextDouble();
                area=2*pie*radius*height;
            }
            case 9->{
                System.out.print("Enter side");
                double side= sc.nextDouble();
                area=6*Math.pow(side,2);
            }
        }
        System.out.printf("Area: %.3f", area);

    }
}