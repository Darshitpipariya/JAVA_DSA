package com.kunalKushwaha.arrays;

import java.util.Arrays;
import java.util.Scanner;

//https://leetcode.com/problems/shuffle-the-array/
/*Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

        Return the array in the form [x1,y1,x2,y2,...,xn,yn]*/
public class ShuffleTheArray {
    static int[] shuffle(int[] nums, int n) {
        int[] m=new int[2*n];
        int index=0;
        for(int i=0;i<n;i++){
            m[index++]=nums[i];
            m[index++]=nums[i+n];
        }
        return m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size");
        int size=sc.nextInt();
        int[] arr=new int[2*size];
        System.out.print("Enter elements:");
        for (int i = 0; i < 2*size; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Original array:"+Arrays.toString(arr));
        System.out.println("Suffeld array:"+ Arrays.toString(shuffle(arr,size)));
    }

}
