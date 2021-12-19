package com.company;

public class LinearSearch {
    public static void main(String[] args) {
        int[] A = new int[2];
        A[0] = 1;
        A[1] = 2;
        A[2] = 5;

        int B=2;

        for (int i =0;i<=A.length;i++){
            if (B==A[i]){
                System.out.println("1");
            }
            else {
                System.out.println("0");
            }
        }
    }
}
