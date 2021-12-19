package com.company;

public class CharIndex {
    public static void main(String[] args) {
        String A = "scaler";
        int[] a = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        String value = "";
        for(int i=0;i<A.length();i++){
           for (int j=0;j<a.length;j++){
              if (A.charAt(i)== a[j]){
                  value+=A.charAt(i)+String.valueOf(j+1);
              }
           }
        }
        System.out.println(value);
    }
}
