package org.example;

public class T5 {
    public static void main(String[] args) {
        /* Write a program to swap 2 numbers without a temporary variable? */
        int first=20;
        int second=15;
        first=first+second;
        second=first-second;
        first=first-second;

        System.out.println("first number after swapping is "+first);
        System.out.println("second number after swapping is "+second);

    }
}
