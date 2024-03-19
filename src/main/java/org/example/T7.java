package org.example;

public class T7 {
    public static void main(String[] args) {
        /*Write a Java Program to print the first 10 numbers of Fibonacci series*/

        int num =10;
        int first=0;
        int second=1;
        int nextNum;
        for (int i=1; i<=num;i++){
            System.out.println(first+", ");
            nextNum=first+second;
            first=second;
            second=nextNum;

        }
    }
}
