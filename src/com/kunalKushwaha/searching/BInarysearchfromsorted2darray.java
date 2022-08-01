package com.kunalKushwaha.searching;

import java.util.Arrays;
import java.util.Scanner;

public class BInarysearchfromsorted2darray {
    public static int[] binarysearchinRow(int[][] arr,int row,int target,int startcol,int endcol){
        int midcol=startcol+(endcol-startcol)/2;
        if(startcol<=endcol){
            if(arr[row][midcol]==target){
                return new int[] {row,midcol};
            }else if (arr[row][midcol]>target){
                return binarysearchinRow(arr,row,target,startcol,midcol-1);
            }else {
                return binarysearchinRow(arr,row,target,midcol+1,endcol);
            }
        }else {
            return new int[] {-1,-1};
        }

    }
    public static int findrow(int[][] arr,int target){
        int start =0;
        int end= arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            int last_ele_index=arr[mid].length-1;
            //now compare target with mid rows last(biggest) and first(smallest) element
            //if target is bigger than last element that target will be in lower rows so start=mid+1;
            if(arr[mid][last_ele_index]<target){
                start=mid+1;
            }//if target is smaller than first elemrnt of cuurent row than target will be in upper rows so end=mid-1
            else if (arr[mid][0]>target) {
                end=mid-1;
            }//if not bigger than last element and not smaller than first elemrnt than target is in current row so return row index;
            else {
                return mid;
            }
        }
        //if target is not in any row rang so not in matrix;
        return -1;
    }
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,16}
        };
        int target=15;
        //find row in which target is there
        int row=findrow(arr,target);
        if(row==-1){
            System.out.println("Not in Matrix");
        }else {
            System.out.println("Element position is :"+ Arrays.toString(binarysearchinRow(arr,row,target,0,arr[row].length-1)));
        }
    }
}
