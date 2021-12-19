package com.company;

import java.util.Scanner;

public class EasyPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        long result = 1;

        while (B != 0) {
            result *= A;
            --B;
        }

        System.out.println(result);
    }
}
