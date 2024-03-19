package org.example;

public class T4 {
    public static void main(String[] args) {
        /* Create a 2D array of integers.
         Develop a program which will calculate the sum of  even and odd numbers for that array. */
        int[][] num={
                {15,40,35,60,31},
                {22,27,62,93,10},
                {43,2,13,8,7}
        };
        int even=0;
        int odd=0;

        for (int []n:num){
            for (int k:n) {
                if (k % 2 == 0) {
                    even += k;
                }else{
                    odd+=k;
                }
            }
        }
        System.out.println("the Sum of the even numbers is "+even);
        System.out.println("the Sum of the odd numbers is "+odd);
    }
}
