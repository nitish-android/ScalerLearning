package com.company;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A= scanner.nextInt();
        boolean flag = false;

        for (int i=2;i<=A/2;i++){
            if (A%i == 0){
                flag =true;
                break;
            }
        }

        if (!flag){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
