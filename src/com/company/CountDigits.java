package com.company;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 1;i<=T;i++){
            int count = 0;
            int A = sc.nextInt();
                if (A==0){
                    System.out.println(1);
                }
                while ((A>0)) {
                    count++;
                A = A / 10;
                }
                System.out.println(count);
            }
        }
    }


