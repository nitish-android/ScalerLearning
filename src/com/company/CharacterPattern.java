package com.company;

import java.util.Scanner;

public class CharacterPattern {
    public static void main(String[] args) {
        int alphabet = 65;

        Scanner scanner = new Scanner(System.in);
        int A= scanner.nextInt();
        for (int i = 0; i <= A-1; i++)
        {
            for (int j = 0; j <= i-1; j++)
            {
               // System.out.print((char) alphabet + " ");
                if (i==j){
                    System.out.print(alphabet);
                }
                else {
                    System.out.print(alphabet + " ");
                }

            }
            alphabet++;
            System.out.println();
        }
    }
}
