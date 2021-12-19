package com.company;

import java.util.Scanner;

public class MultiplicationOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int result = 0;
        for (int i = 1; i<=10 ; i++){
            result = a*i;
            System.out.println(a+" * " +i +" = "+result);
        }

    }
}
