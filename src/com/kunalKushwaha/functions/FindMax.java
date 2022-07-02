package com.kunalKushwaha.functions;

import java.util.Scanner;

public class FindMax {


    static double max(double n1, double n2, double n3){
        double max_num;
        max_num=Double.max(n1,Double.max(n2,n3));

        /*if(Double.compare(n1,n2)>=0){
            if(Double.compare(n1,n3)>=0){
                max_num=n1;
            }
            else {
                max_num=n3;
            }
        }else {
            if(Double.compare(n2,n3)>=0){
                max_num=n2;
            }
            else {
                max_num=n3;
            }
        }
*/
        return max_num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1:");
        double n1= sc.nextDouble();
        System.out.print("Enter num2:");
        double n2= sc.nextDouble();
        System.out.print("Enter num3:");
        double n3=sc.nextDouble();
        System.out.println("max num "+max(n1,n2,n3));
    }
}
