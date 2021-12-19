package com.company;

public class CountPairs {
    public static void main(String[] args) {
        int[] A = {1,2,3,2,1};
        int B = 5;
        int count = 0;
        for(int i=0;i<=A.length; i++){
            for (int j=i+1;j<A.length;j++){
                 if (A[i] + A[j] == B){
                     count++;
                 }
            }
        }
        System.out.println(count);

    }
}
