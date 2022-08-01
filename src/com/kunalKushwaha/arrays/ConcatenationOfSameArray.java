package com.kunalKushwaha.arrays;


import java.util.Arrays;
import java.util.Scanner;

public class ConcatenationOfSameArray {
    static int[] getConcatenation(int[] nums) {
        int n= nums.length;
        int[] arr=new int[n*2];
        for(int i=0;i< n;i++){
            arr[i]=nums[i];
            arr[i+n]=nums[i];
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
        System.out.print("concatenation of same arr:"+ Arrays.toString(getConcatenation(arr)));
    }
}
