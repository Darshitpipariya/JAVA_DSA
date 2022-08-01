package com.kunalKushwaha.arrays;

import java.util.Arrays;
import java.util.Scanner;


public class RunningSum {
    static int[] runningSum(int[] nums) {
        int size=nums.length;
        int[] sumarr=new int[size];
        sumarr[0]=nums[0];
        //previous value of sumarr + current value of nums
        for(int i=1;i<size;i++){
            sumarr[i]=sumarr[i-1]+nums[i];
        }
        return sumarr;
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
        System.out.println("running sum array is:"+ Arrays.toString(runningSum(arr)));
    }
}
