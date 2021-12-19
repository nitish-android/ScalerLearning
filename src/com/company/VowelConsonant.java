package com.company;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        char s = scanner.next().charAt(0);

        if (s=='a' || s == 'e' || s == 'i'|| s == 'o' || s=='u' ){
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }
    }
}
