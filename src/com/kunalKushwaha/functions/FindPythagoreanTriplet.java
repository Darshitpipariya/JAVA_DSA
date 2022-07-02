package com.kunalKushwaha.functions;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


//A^2=b^2+c^2;//abc is triplet
public class FindPythagoreanTriplet {
    static boolean checkTriplet(int[] arr){
//        O(n3) method using all possible combination
        int size=arr.length;
        for(int a=0;a<size;a++){
            for (int b=a+1;b<size;b++){
                for (int c=b+1;c<size;c++){
                    int a_sq=arr[a]*arr[a];
                    int b_sq=arr[b]*arr[b];
                    int c_sq=arr[c]*arr[c];
                    if(a_sq==b_sq+c_sq || b_sq==a_sq+c_sq ||c_sq==a_sq+b_sq ){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    static boolean checkTripletHashmap(int[] arr){
//        using hashmap search O(n2)
        HashMap<Integer,Integer> map=new HashMap<>();
        int size=arr.length;
//        insert value in hashmap
        for(int i=0;i< arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr)+1);
            }else {
                map.put(arr[i],1);
            }
        }

//        find triplet in arr
        for(int i=0;i<size;i++){
            for (int j=i+1;j<size;j++){
                int p=arr[i]*arr[i]+arr[j]*arr[j];
                if(map.containsKey(p)){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter array size:");
        int size=Integer.parseInt(br.readLine());
        int[] arr=new int[size];
        System.out.print("Enter elements:");
        String s_arr= br.readLine();
        int index=0;
        for(String s:s_arr.split(" ")){
            arr[index++]=Integer.parseInt(s);
        }
        System.out.println(checkTriplet(arr));
        System.out.println(checkTripletHashmap(arr));

    }
}
