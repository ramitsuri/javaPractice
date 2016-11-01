package com.ramitsuri.javapractice.MobileIron;

/**
 * Created by ramitsuri on 4/8/16.
 */

/**
 * complement of a decimal number
 * input = 50
 * output = 110010 -> 001101 -> 13
 */
public class Complement {

    static int getIntegerComplement(int n) {
        int maxBit = 0;
        int lastPower = 0;
        int powerOfTwo = 0;
        int complement = 0;
        //List<>
        while(n>0){
            powerOfTwo = getPowerOfTwo(n);
            if(lastPower == 0)
                lastPower = powerOfTwo;
            complement += getSum(lastPower, powerOfTwo);
            if(maxBit==0)
                maxBit = powerOfTwo-1;

            n = n - (int)(Math.pow(2,powerOfTwo));

        }
        return complement;
    }

    private static int getSum(int lastPower, int powerOfTwo) {
        int sum = 0;
        for(int i=lastPower; i>powerOfTwo;i--){
            sum+=(int)(Math.pow(2, i));
        }
        return sum;
    }

    static int getPowerOfTwo(int n){
        return (int)(Math.log(n)/Math.log(2));
    }

    private static String convertBinaryform(String a, int number) {
        int remainder;

        if (number <= 1) {
            System.out.print(number);
            return "";
        }

        remainder = number %2;
        convertBinaryform(a, number >> 1);
        a+=remainder;
        return a;
    }

    public static void main(String args[]){
        //System.out.println((int)(Math.log(100000)/Math.log(2)));

        System.out.print(convertBinaryform("",100));
    }

}
