package com.ramitsuri.javapractice.LeetCode; /**
 * Created by ramitsuri on 10/31/2016.
 */
public class ReverseInt {
    public static int reverseInt(int number){
        int result = 0;
        while(number!=0) {
            result = result * 10;
            result = result + number % 10;
            number = number / 10;
        }
        return result;
    }

    public static void main(String args[]){
        System.out.print(reverseInt(100));
    }

}
