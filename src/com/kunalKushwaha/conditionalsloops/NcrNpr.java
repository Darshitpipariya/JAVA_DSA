package com.kunalKushwaha.conditionalsloops;

import java.util.Scanner;

public class NcrNpr {
    static int fact(int n) {
        if (n == 1) {
            return 1;
        }
        return fact(n - 1) * n;
    }

    static int Ncr(int n, int r) {
        if (n == r) {
            return 1;
        }
        return fact(n) / (fact(r) * fact(n - r));
    }

    static int Npr(int n, int r) {
        if (n == r) {
            return fact(n);
        }
        return fact(n) / fact(r);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose Options:\n1.Ncr\n2.Npr ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1 -> {
                System.out.print("Enter total num(objects):");
                int num = sc.nextInt();
                System.out.print("Enter r(sample):");
                int r = sc.nextInt();
                System.out.println(Ncr(num, r));
            }
            case 2 -> {
                System.out.print("Enter total num(objects):");
                int num = sc.nextInt();
                System.out.print("Enter r(sample):");
                int r = sc.nextInt();
                System.out.println(Npr(num, r));
            }

        }

    }
}
