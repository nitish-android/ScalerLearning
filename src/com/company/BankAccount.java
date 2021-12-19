package com.company;

import javax.swing.plaf.basic.BasicLabelUI;
import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = scanner.nextInt(); //1000
        int operations = scanner.nextInt();//3


        for (int i = 1;i<=operations;i++){
            int Add = scanner.nextInt();//500
            int Subs = scanner.nextInt();//1400

        }

    }
}
