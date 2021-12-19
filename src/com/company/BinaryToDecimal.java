package com.company;

import java.util.Scanner;

public class BinaryToDecimal {
    static int binaryToDecimal(long n)
    {
        long num = n;
        long dec_value = 0;

        // Initializing base
        // value to 1, i.e 2^0
        int base = 1;

        long temp = num;
        while (temp > 0) {
            long last_digit = temp % 10;
            temp = temp / 10;

            dec_value += last_digit * base;

            base = base * 2;
        }

        return (int) dec_value;
    }

    // Driver Code
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        long num = scanner.nextLong();
        System.out.println(binaryToDecimal(num));
    }
}
