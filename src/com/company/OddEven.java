package com.company;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        if (A/2==0){
            System.out.println(0);
        }else {
            System.out.println(1);
        }
    }
}
