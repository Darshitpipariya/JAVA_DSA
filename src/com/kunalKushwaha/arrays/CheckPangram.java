package com.kunalKushwaha.arrays;

import java.util.HashSet;

import java.util.Scanner;

//https://leetcode.com/problems/check-if-the-sentence-is-pangram/
/* A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.
* */
public class CheckPangram {
    static boolean checkIfPangram(String sentence) {
//      hash set is store unique every element no duplicates allowed and if size 26 of set that all alphabet are in sentence
        HashSet<Character> charArr=new HashSet<>();
        for (char c:sentence.toCharArray()){
            charArr.add(c);
        }
        return charArr.size()==26?true:false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence with lower alphabet without space");
        String s= sc.nextLine();
        System.out.println("Is sentence contain all lower alphabet: "+checkIfPangram(s));
    }
}
