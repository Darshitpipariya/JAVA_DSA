package com.kunalKushwaha.arrays;

import java.util.Scanner;
//https://leetcode.com/problems/number-of-good-pairs/submissions/
public class IdenticalPairs {
    static int numIdenticalPairs(int[] nums) {
        int num=0;
        int size=nums.length;
        for(int i=0;i<size-1;i++){
            for(int j=i+1;j<size;j++){
                num+=(nums[i]==nums[j])?1:0;
            }
        }
        return num;
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
        System.out.println(numIdenticalPairs(arr));
    }
}
