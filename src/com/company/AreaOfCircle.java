package com.company;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();

        double area=0;

        area=  (3.14*A*A);
        System.out.println((int)Math.ceil(area));
    }
}
