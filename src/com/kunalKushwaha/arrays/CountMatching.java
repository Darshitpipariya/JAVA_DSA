package com.kunalKushwaha.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountMatching {
    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0;
        for (List<String> item:
             items) {
            if(ruleKey.equals("type") && item.get(0).equals(ruleValue)){
                count++;
            } else if (ruleKey.equals("color") && item.get(1).equals(ruleValue)) {
                count++;
            } else if (ruleKey.equals("name") && item.get(2).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        List<List<String>> l= new ArrayList<List<String>>();
        String type,color,name;
        System.out.println("Enter number of items: ");
        Scanner sc = new Scanner(System.in);
        int numofitems= sc.nextInt();
        for(int i=0;i<numofitems;i++){
            l.add(new ArrayList<String>());
        }
        sc.nextLine();
        for(int j=0;j<numofitems;j++){
            System.out.println("Enter type of item "+(j+1));
            type=sc.nextLine();
            System.out.println("Enter color of item "+(j+1));
            color=sc.nextLine();
            System.out.println("Enter name of item "+(j+1));
            name=sc.nextLine();
            l.get(j).add(type);
            l.get(j).add(color);
            l.get(j).add(name);
        }
        System.out.println(countMatches(l,"type","1"));
    }
}
