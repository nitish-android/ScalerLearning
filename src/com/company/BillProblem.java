package com.company;

import java.util.Scanner;

public class BillProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long A = scanner.nextLong();
        double amt;


        if(A <= 50)
        {
            amt = A * 0.50;
        }
        else if(A <= 150)
        {
            amt = 25 + ((A - 50) * 0.75);
        }
        else if(A <= 250)
        {
            amt = 100 + ((A - 150) * 1.20);
        }
        else
        {
            amt = 220 + ((A - 250) * 1.50);
        }
        double total_amt  = amt + amt * 0.20;
            System.out.println((int)Math.floor(total_amt));
    }
}
