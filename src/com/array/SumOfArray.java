package com.array;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        int sum = 0;
        for (int i = 0;i<A.length;i++){
           sum = sum+A[i];
        }
        System.out.println(sum);
    }
}
