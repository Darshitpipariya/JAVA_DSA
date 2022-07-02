package com.kunalKushwaha.functions;

import java.util.ArrayList;
import java.util.Scanner;

public class FindPrimeInRange {
    static boolean checkprime(int num){
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1:");
        int num1=sc.nextInt();
        System.out.print("Enter num2:");
        int num2=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int temp=num1;temp<=num2;temp++){
            if(checkprime(temp)){
                arr.add(temp);
            }
        }
        System.out.println("Prime number in between "+num1+"and "+num2+"is "+arr);
    }
}
