package com.ramitsuri.javapractice.LeetCode;

/**
 * Created by ramitsuri on 3/14/16.
 */
public class Reverse {
    public static int reverse(int x) {
        boolean isNegative = false;
        if(x<0){
            isNegative = true;
            x = Math.abs(x);
        }

        int rem = 0;
        int count = 0;
        int sum = 0;

        while(x>=10){
            count = count + 1;
            rem = x%10;
            x = x/10;
            sum = sum + (int)(rem * Math.pow(10, (int)(Math.log10(x))+1));
        }
        sum = sum + x;
        if(isNegative)
            sum = sum * (-1);
return sum;
    }
public static void main(String args[]){
    //System.out.print(Math.log10(153423646));
    System.out.println(reverse(1534236468));
}
}
