package com.kunalKushwaha.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FlipingImage {
    static int[][] flipAndInvertImage(int[][] image) {
        int numofrow=image.length;
        int numofcolomn=image[0].length;
        int[][] inverted_flipped=new int[numofrow][numofcolomn];
        for(int i=0;i<numofrow;i++){
            for(int j=numofcolomn-1;j>=0;j--){
//                 XOR 1 with image[i][j] element to invert it and store it in inverted_flipped[i][numofcolumn-j-1]
                inverted_flipped[i][numofcolomn-j-1]=image[i][j]^1;
            }
        }
        return inverted_flipped;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size");
        int size=sc.nextInt();
        int[][] arr=new int[size][size];
        System.out.print("Enter elements:");
        for (int i = 0; i < size; i++) {
            System.out.println(String.format("Enter %d th row ",(i+1)));
            for (int j = 0; j < size; j++) {
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.print("Inverted and flipped matrix is "+Arrays.deepToString(flipAndInvertImage(arr)));

    }
}
