package com.kunalKushwaha.conditionalsloops;

import java.util.Scanner;

/*Write a program to print the sum of negative numbers,
 *sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user.
 *The list terminates when the user enters a zero.
 */
public class Sum14th {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sumNegative = 0, sumEvenPositive = 0, sumOddPositive = 0;
        while (true) {
            n = sc.nextInt();
            if (n == 0) {
                break;
            } else if (n < 0) {
                sumNegative += n;
            } else if (n % 2 == 0) {
                sumEvenPositive += n;
            } else {
                sumOddPositive += n;
            }
        }
        System.out.print("sum of negative: "+sumNegative+"\nsum of even positive: "+sumEvenPositive+"\nsum of odd positive: "+sumOddPositive);
    }
}
