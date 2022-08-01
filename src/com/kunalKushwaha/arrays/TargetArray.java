package com.kunalKushwaha.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
//https://leetcode.com/problems/create-target-array-in-the-given-order/
public class TargetArray {
    static int[] createTargetArray(int[] nums, int[] index) {
        int size=nums.length;
        int[] target=new int[size];
        for(int i=0;i<size;i++){
            //push elements of target from left to right upto index[i]
            for(int j=size-1;j>index[i];j--){
                target[j]=target[j-1];
            }
//            insert element in target
            target[index[i]]=nums[i];
        }
        return target;
    }
    static int[] createTargetArrayUsingArrayList(int[] nums, int[] index) {
        int size=nums.length;
        ArrayList<Integer> arr=new ArrayList<>();
        int[] target=new int[size];
        for(int i=0;i<size;i++){
            arr.add(index[i],nums[i]);
        }
        for(int i=0;i<size;i++){
            target[i]= arr.get(i);
        }
        return target;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size");
        int size=sc.nextInt();
        int[] nums=new int[size];
        System.out.print("Enter elements:");
        for (int i = 0; i < size; i++) {
            nums[i]=sc.nextInt();
        }
        int[] index=new int[size];
        System.out.print("Enter elements:");
        for (int i = 0; i < size; i++) {
            index[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(createTargetArrayUsingArrayList(nums,index)));
    }
}
