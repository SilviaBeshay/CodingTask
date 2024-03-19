package org.example;

public class T_1 {
    /*.	Create a program that uses an array to store a list of temperatures for
     a week, and then uses a loop to find the highest and lowest temperature for the week.*/
    public static void main(String[] args) {
        int[] temp={-1,25,-5,10,16,22,8};
        int high=temp[0];
        int low=temp[0];
        for (int n:temp){
            if (n>high){
                high=n;
            }
            if (n<low){
                low=n;
            }
        }
        System.out.println("the Highest Temperature during the week is "+high);
        System.out.println("the Lowest Temperature during the week is "+low);

    }
}
