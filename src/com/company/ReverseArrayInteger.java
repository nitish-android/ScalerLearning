package com.company;

import java.util.Scanner;

public class ReverseArrayInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int [] arr = new int [N];

        for (int i =  0 ; i < N; i++) {
            int B = scanner.nextInt();
            arr[i]=B;

        }
        for (int i = N-1 ; i >= 0 ; i -- ){
            System.out.print(arr[i] + " ");
        }
    }
}
