package com.kunalKushwaha.conditionalsloops;

import java.io.*;

public class AvgofNnum {
    public static void main(String[] args) throws IOException {
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(in);
        String list= br.readLine();
        int sum=0;
        int size=list.split(",").length;
        for(String s:list.split(",")){
            sum+=Integer.parseInt(s);
        }

        System.out.println(size);
        System.out.println(sum/size);
    }
}

