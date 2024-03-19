package org.example;

public class T8 {
    public static void main(String[] args) {
        /* 8.	Maximum and minimum number in the array? */

        int[]num={-2,5,10,100,-6,60};
        int max=num[0];
        int mini=num[0];
        for (int i=0; i< num.length; i++){
            if (num[i]>max){
                max=num[i];
            }
            if (num[i]<mini){
                mini=num[i];
            }
        }
        System.out.println(max);
        System.out.println(mini);

    }
}
