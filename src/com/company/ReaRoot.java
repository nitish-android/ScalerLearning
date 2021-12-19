package com.company;

import java.util.Scanner;

public class ReaRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int result = 0;

        result = B*B-4*A*C;
        System.out.println(result);
        if (result>0){
            System.out.println(1);
        }
        else if (result==0){
            System.out.println(0);
        }
        else {
            System.out.println(-1);
        }
    }
}
