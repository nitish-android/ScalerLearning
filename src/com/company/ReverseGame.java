package com.company;

import java.util.Scanner;

public class ReverseGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int reverse1 = 0;
        int reverse2 =0;
        while(A != 0)
        {

            int remainder1 = first % 10;
            int remainder2 = second % 10;
            reverse1 = reverse1 * 10 + remainder1;
            reverse1 = reverse2 *10 +remainder2;
            first = first/10;
            second = second/10;


        }
        System.out.println(reverse1);
        System.out.println(reverse2);
    }
}
