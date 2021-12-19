package com.company;

import java.util.Scanner;

public class PrimeRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A= scanner.nextInt();
        int num = 0;

        for (int i=1;i<=A;i++){

            int counter=0;
            for(num =i; num>=1; num--)
            {
                if(i%num==0)
                {
                    counter = counter + 1;
                }
            }
            if (counter ==2)
            {
                System.out.println(i);
            }
        }
    }
}
