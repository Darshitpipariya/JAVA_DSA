package com.kunalKushwaha.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
public class KidsWithCandies {
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> l=new ArrayList<>();
        int max=candies[0];
        for (int candy : candies) {
            max = Math.max(candy, max);
        }
//        if after adding extra candies sum is greater than max that it is also max of all hence return true else return false
        for (int item:
                candies) {
            l.add(max<=item+extraCandies);
        }
        return l;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of kids:");
        int size=sc.nextInt();
        int[] candies=new int[size];
        System.out.println("Enter candies for each kids");
        for (int i = 0; i < size; i++) {
            candies[i]=sc.nextInt();
        }
        System.out.print("Enter extraCandies:");
        int extraCandies=sc.nextInt();
        System.out.println(kidsWithCandies(candies,extraCandies));
    }
}
