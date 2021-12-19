package com.company;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int gcd = 1;
        for(int i = 1; i <= A && i <= B; i++)
        {
            if(A%i==0 && B%i==0)
                gcd = i;
        }
        System.out.println(gcd);

    }
}
