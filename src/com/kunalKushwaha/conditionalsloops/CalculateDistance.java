package com.kunalKushwaha.conditionalsloops;


import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Scanner;

public class CalculateDistance {
    static double distance2d(@NotNull ArrayList<Integer> p1, @NotNull ArrayList<Integer> p2) {
        return Math.sqrt(Math.pow(p1.get(0) - p2.get(0), 2) + Math.pow(p1.get(1) - p2.get(1), 2));
    }

    static double distance3d(@NotNull ArrayList<Integer> p1, @NotNull ArrayList<Integer> p2) {
        return Math.sqrt(Math.pow(p1.get(0) - p2.get(0), 2) + Math.pow(p1.get(1) - p2.get(1), 2) + Math.pow(p1.get(2) - p2.get(2), 2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> p1 = new ArrayList<>();
        ArrayList<Integer> p2 = new ArrayList<>();
        System.out.print("Enter point1: ");
        double d = 0;
        String[] ps1 = sc.nextLine().split(" ");
        for (String s :
                ps1) {
            p1.add(Integer.parseInt(s));
        }
        System.out.print("Enter point2: ");
        String[] ps2 = sc.nextLine().split(" ");
        for (String s :
                ps2) {
            p2.add(Integer.parseInt(s));
        }
        if (p1.size() == p2.size()) {

            if (p1.size() == 1) {
                d = Math.abs(p1.get(0) - p2.get(0));
            } else if (p1.size() == 2) {
                d = Math.abs(distance2d(p1, p2));
            } else if (p1.size() == 3) {
                d = Math.abs(distance3d(p1, p2));
            }
            System.out.printf("Distance: %.3f", d);
        } else {
            System.err.println("Points are not in same dimensions ");
        }

    }
}
