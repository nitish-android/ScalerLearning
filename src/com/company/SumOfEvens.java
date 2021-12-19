package com.company;

import java.util.Scanner;

public class SumOfEvens {

        static int fun(int n)
        {
            int i, sum = 0;
            for (i = 2; i <= n; i+=2) {
                sum += i;
            }
            return sum;
        }
        public static void main(String argc[])
        {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.println( fun(n));
        }
    }

