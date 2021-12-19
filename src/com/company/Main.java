package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for(int i =0 ; i< a; i++){
            int b = sc.nextInt();
            int[] c = new int[b];
            for(int j = 0; j< b ; j++){
                c[j] = sc.nextInt();

            }
            for(int l : c){
                if(l % 2 == 0)
                    System.out.print(l + " ");
            }
        }


    }
}
