package com.kunalKushwaha.flowofprogram;


import java.util.Scanner;

public class HCFandLCM {
    //Euclidean GCD or HCF
    static int Egcd(int a, int b)
    {
        if (b == 0)
            return a;
        return Egcd(b, a % b);
    }
//    we first find minimum of two num and reduce it until we find common factor that divide booth number
    static int gcd(int num1,int num2){
        int min= Math.min(num1, num2);
        while (min>0){
            if (num1%min==0 && num2%min==0) {
                break;
            }
            min--;
        }
        return min;
    }

    static int lcm(int num1,int num2){
        int max= Math.max(num1, num2);
        while(true){
            if(max%num1==0 && max%num2==0){
                return max;
            }
            ++max;
        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in );
        System.out.println("Enter num1: ");
        int num1=sc.nextInt();
        System.out.println("Enter num2: ");
        int num2=sc.nextInt();
//      HCF or GCD
        System.out.println("HCF of num1 and num2 "+gcd(num1,num2));
//      LCM
        System.out.println("LCM of num1 and num2 "+lcm(num1,num2));
    }
}
