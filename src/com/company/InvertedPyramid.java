package com.company;

import java.util.Scanner;

public class InvertedPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i--) {
            for (int j = 1; j <= i; j++) {
                if (i==j){
                    System.out.print(j);
                }
                else {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}
