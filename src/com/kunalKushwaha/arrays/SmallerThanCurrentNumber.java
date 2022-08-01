package com.kunalKushwaha.arrays;

import java.util.Arrays;
import java.util.HashMap;

public class SmallerThanCurrentNumber {
    static int[] smallerNumbers(int[] arr){
//    o(n2)
        int size=arr.length;
        int[] count=new int[size];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(i!=j && arr[j]<arr[i]){
                    count[i]+=1;
                }
            }
        }
        return count;
    }
    static int[] usingcountingsortsmallerNumbers(int[] arr){
        int size=arr.length;
        int[] count=new int[102];   //beccause 0<=num[i]<=100
        int[] res=new int[size];
        for(int i=0;i<size;i++){
            count[arr[i]-1]+=1;//store count of arr[i] element in count array at index arr[i]
        }
        for(int i=1;i<102;i++){
            count[i]+=count[i-1];//for ith index sum of all less number will be
        }
        for (int i = 0; i < size; i++) {
            if (arr[i] == 0)
                res[i] = 0;
            else
                res[i] = count[arr[i] - 1];
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={5,2,4,7,9,1};
        System.out.println(Arrays.toString(smallerNumbers(arr)));
    }
}
