package com.company;

import java.util.Scanner;

public class FullPyramydPatterns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i=1;i<=n;i++){
            // for first zero
            for (int j=1;j<=n-i;j++){
                System.out.print(0+" ");
            }

            for (int j=i;j<=2*i-1;j++){
                System.out.print(j+" ");
            }
            for (int j=2*i-2;j>=i;j--){
                System.out.print(j+" ");
            }

            //for second zero
            for (int j=1;j<=n-i;j++){
                System.out.print(0+ " ");
            }

            System.out.println();



        }
    }
}
