package com.company;

import java.util.Scanner;

public class FactorialDec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        factDec(A);
    }

     static void factDec(int a) {
        if (a == 0){
            return;
        }
         System.out.println(a);
        factDec(a-1);
    }
}
