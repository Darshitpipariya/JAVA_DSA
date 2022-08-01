package com.kunalKushwaha.arrays;

import java.util.Arrays;
import java.util.Scanner;

// https://leetcode.com/problems/build-array-from-permutation/
public class BulidArrayPermutation {
    static int[] buildArray(int[] num){
        int size=num.length;
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=num[num[i]];
        }
        return arr;
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
        System.out.println(Arrays.toString(buildArray(arr)));
    }
}
