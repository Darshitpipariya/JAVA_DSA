package com.kunalKushwaha.conditionalsloops;

import java.util.Scanner;

public class Perimeters {
    static double pie=3.14;


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("""
                CHOOSE OPTION
                1.  Perimeter Of Circle
                2.  Perimeter Of Equilateral Triangle
                3.  Perimeter Of Parallelogram
                4.  Perimeter Of Rectangle
                5.  Perimeter Of Square
                6.  Perimeter Of Rhombus""");
        int choice=sc.nextInt();
        double Perimeter=0;
        switch (choice){
            case 1->{
                System.out.print("Enter radius: ");
                double radius=sc.nextDouble();
                Perimeter=2*pie*radius;
            }
            case 2->{
                System.out.print("Enter side: ");
                double side=sc.nextDouble();
                Perimeter=3*side;
            }
            case 3->{
                System.out.print("Enter base: ");
                double base= sc.nextDouble();
                System.out.print("Enter side: ");
                double side= sc.nextDouble();
                Perimeter=2*(base+side);
            }
            case 4->{
                System.out.print("Enter height: ");
                double height= sc.nextDouble();
                System.out.print("Enter length: ");
                double length=sc.nextDouble();
                Perimeter=2*(height+length);
            }
            case 5,6->{
                System.out.print("Enter side: ");
                double side=sc.nextDouble();
                Perimeter=4*side;
            }
        }
        System.out.printf("Perimeter: %.3f" , Perimeter);
    }
}
