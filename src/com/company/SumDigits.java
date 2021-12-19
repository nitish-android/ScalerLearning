package com.company;

import java.util.Scanner;

public class SumDigits {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i=0;i<T;i++){
            int sum = 0;
            int A = scanner.nextInt();
            while (A>0){
                sum = sum + A % 10;
                A = A/10;
            }

            System.out.println(sum);
        }
    }
    }

