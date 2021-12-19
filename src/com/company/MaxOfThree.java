package com.company;

import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        if ( A>=B && A>=C){
            System.out.println(A + " is maximum element");
        }else if (B>=A && B>= C){
            System.out.println( B + " is maximum element");
        }else {
            System.out.println(C + " is maximum element");
        }
    }
}
