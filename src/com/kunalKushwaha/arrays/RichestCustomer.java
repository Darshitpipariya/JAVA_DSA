package com.kunalKushwaha.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RichestCustomer {
    static int maximumWealth(int[][] accounts) {
        int max_welth=0;
        int m=accounts.length;
        int[] wealth=new int[m];
        for(int i=0;i<m;i++){
            for(int a:accounts[i]){
                wealth[i]+=a;
            }
            if(wealth[i]>max_welth){
                max_welth=wealth[i];
            }
        }
        return max_welth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of customers");
        int m=sc.nextInt();
        System.out.println("Enter numbers of banks");
        int n=sc.nextInt();
        int[][] arr=new int[m][n];
        System.out.println("Enter elements:");
        for (int i = 0; i < m; i++) {
            System.out.println("Enter customer "+(i+1));
            for (int j=0;j<n;j++){
                System.out.print(" bank "+(j+1)+" balance is:");
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Richest man is"+maximumWealth(arr));
    }
}
