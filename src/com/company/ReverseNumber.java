package com.company;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        int result;
        int ntimes;
        ntimes= sc.nextInt();
        for (; ntimes>0 ; ntimes--){
            int ans = 0;
            for (a = sc.nextInt(); a>0;a =a/10){

                result = a %10;
                ans = ans *10 +result;


            }
            System.out.println(ans);
        }


    }
}
