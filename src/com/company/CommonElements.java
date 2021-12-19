package com.company;

import java.util.ArrayList;

public class CommonElements {
    public static void main(String[] args) {

        int[] A = {1,2,2,1};
        int[] B = {2,3,1,2};

//        int[] A = {2,1,4,10};
//        int[] B = {3,6,2,10,10};
        ArrayList<Integer> c = new ArrayList<>();
            for(int i =0;i<A.length;i++){
                for (int j = i+1;j<B.length;j++){
                    if (A[i] == B[j]){
                        c.add(A[i]);
                    }
                }
            }
        System.out.println(c);
    }
}
