package com.company;

import java.util.Scanner;

public class MinOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        if (A<=B && A<=C){
            System.out.println(A);
        }else if (B<=A && B<= C){
            System.out.println(B);
        }
        else {
            System.out.println(C);
        }
    }
}
