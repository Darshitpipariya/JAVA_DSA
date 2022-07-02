package com.kunalKushwaha.functions;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


/*
Marks        Grade
91-100         AA
81-90          AB
71-80          BB
61-70          BC
51-60          CD
41-50          DD
<=40          Fail
*/
public class MarksToGrade {
    @Contract(pure = true)
    static @NotNull String findgrade(int marks){
        if(marks>100){
            return "Marks not in range";
        } else if (marks>90) {
            return "AA";
        } else if (marks>80) {
            return "AB";
        } else if (marks>70) {
            return "BB";
        } else if (marks>60) {
            return "BC";
        } else if (marks>50) {
            return "CD";
        } else if (marks>40) {
            return "DD";
        }else {
            return "Fail";
        }
    }
    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter marks:");
        int marks=Integer.parseInt(br.readLine());
        System.out.println("Your grade is "+findgrade(marks));

    }
}
