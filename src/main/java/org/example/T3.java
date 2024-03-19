package org.example;

public class T3 {

         /* Create a 2D array or integer type where you will store odd and even numbers.
Develop a program which will identify/print the even numbers */
        public static void main(String[] args) {
            int[][] num={
                    {15,40,60,35,80},
                    {22,3,62,10,93},
                    {43,2,13,7,8}
            };

            for (int []n:num)
                for (int k:n) {
                    if (k % 2 == 0)
                        System.out.println(k);
                }

        }
}
