package com.company;

import java.util.Scanner;

public class PercentageGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        int E = scanner.nextInt();

        int marks = 0;
         marks = (A+B+C+D+E)/5;

        System.out.println(marks);

        if (marks >= 90){
            System.out.println(marks + " A");
        }
        else if (marks >= 80){
            System.out.println(marks + " B");
        }
        else if (marks >= 70){
            System.out.println(marks + " C");
        }
        else if (marks >= 60){
            System.out.println(marks + " D");
        }
        else if (marks >= 40){
            System.out.println(marks + " E");
        }
        else {
            System.out.println(marks + " F");
        }


 }
}
