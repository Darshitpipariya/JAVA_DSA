package com.kunalKushwaha.searching;

import java.util.Arrays;

//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class searchInASortedArrayOfInfiniteNumbers {
    // we start with 1,2,4 8 we will exponential increase our size of search space
    public static int[] findRange(int[] arr,int target,int start,int end){
        try{
            if(end>=arr.length){
                throw new Exception("Index out of range");
            }
            if(target<arr[start]){//element not found in array after cheking all range less than target element
                return new int[]{-1,-1};
            }
            if(arr[start]<=target && target<=arr[end]){//element found in array
                return new int[] {start,end};
            }else {
//            int s=end+1;//new start we cant store in start because we will use it for finding cur size of search space
                int cur_search_space=(end-start+1);
                start=end+1;
                end=end+2*cur_search_space;
                return findRange(arr,target,start,end);
            }
        }catch (Exception e){
            System.err.println(e.getMessage());
        }


        return new int[]{-1,-1};
    }
    public static  int Bsearch(int[] arr,int target){
        int [] range=findRange(arr,target,0,0);//start with one element;
        System.out.println(Arrays.toString(range));

        return range[0]==-1? -1:Arrays.binarySearch(arr,target);
    }

    public static void main(String[] args) {
        System.out.println(Bsearch(new int[] {3,5,7,9,10,90,100,130,140,160,170,190},180));

    }
}
