package com.kunalKushwaha.arrays;

import java.util.Scanner;

public class HighestAltitude {
    static int largestAltitude(int[] gain) {
        int size=gain.length;
        int[] altitude=new int[size+1];
        int max=altitude[0];
        for(int i=0;i<size;i++){
            altitude[i+1]=altitude[i]+gain[i];
            if(altitude[i+1]>max){
                max=altitude[i+1];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.print("Enter elements:");
        for (int i = 0; i < size; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(largestAltitude(arr));
    }
}
