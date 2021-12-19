package com.company;

import java.util.Scanner;

public class DivisibleBy {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output

        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();


        if( (A%5 == 0) && (A%11 == 0)){
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }

    }
}
