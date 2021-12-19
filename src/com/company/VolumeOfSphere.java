package com.company;

import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
         double area =0;

         area = (4*Math.PI*A*A*A)/3;
        System.out.println(area);
    }
}
