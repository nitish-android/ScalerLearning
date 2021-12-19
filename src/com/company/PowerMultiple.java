package com.company;

import java.util.Scanner;

public class PowerMultiple {
    static int power(int a, int n){
        if (n==0){
            return 1;
        }
        return a*power(a,n-1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(power(a,b));
    }
}
