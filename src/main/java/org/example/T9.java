package org.example;

import java.util.Arrays;

public class T9 {
    public static void main(String[] args) {
        /* 9.	Write a java program to find the second largest number in the array? */

        int[]num={349,5,250,100,140,789,-455};
        Arrays.sort(num);
        System.out.println(num[num.length-2]);

    }
}
