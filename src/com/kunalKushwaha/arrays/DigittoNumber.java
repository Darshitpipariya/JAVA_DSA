package com.kunalKushwaha.arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class DigittoNumber {
    static List<Integer> addToArrayForm(int[] num, int k) {
        long actualNum=0;
        for(int i=0;i<(num.length);i++){
            actualNum*=10;
            actualNum+=num[i];
        }
        List<Integer> ans=new ArrayList<>();
        long temp=actualNum+k;
        while(temp>0){
            int reminder=(int)temp%10;
            ans.add(reminder);
            temp/=10;
        }
        Collections.reverse(ans);
        return ans;
    }

    public static void main(String[] args) {
        int[] arr={9,9,9,9,9,9,9,9,9,9};
        System.out.print(addToArrayForm(arr,1));
    }
}
