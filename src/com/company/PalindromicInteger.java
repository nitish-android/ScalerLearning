package com.company;

import java.util.Scanner;

public class PalindromicInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String original, reverse = ""; // Objects of String class


        original = scanner.nextLine();
        int length = original.length();
        for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + original.charAt(i);
        if (original.equals(reverse))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
