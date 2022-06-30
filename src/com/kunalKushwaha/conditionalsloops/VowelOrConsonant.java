package com.kunalKushwaha.conditionalsloops;

import java.util.Scanner;
import java.util.regex.Pattern;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter char:");
        String s = sc.next();
        String b = Pattern.matches("[aeiouAIEOU]", s) ? "Vovel" : Pattern.matches("[a-z]|[A-Z]", s) ? "Consonant" : "Not valid char";
        System.out.println(b);
    }
}
