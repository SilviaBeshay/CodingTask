package org.example;

public class T10 {
    public static void main(String[] args) {
        /* 10.	Write a program to print out duplicate elements from an Array of Strings? */

        int[]num= {349,5,250,100,140,100,250,60,5};
        for (int j=0; j< num.length; j++ ) {
            for (int i = j + 1; i < num.length; i++) {
                if (num[j]==num[i]){
                    System.out.println(num[i]);
                }

            }
        }

    }
}
