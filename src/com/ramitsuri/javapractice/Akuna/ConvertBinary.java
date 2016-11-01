package com.ramitsuri.javapractice.Akuna;

/**
 * Created by ramitsuri on 2/29/16.
 */
public class ConvertBinary

{

    public static void convertBinary(long num){
        int count = 0;
        while(num > 0){
            long bit = num%2;
            if(bit == 0)
                count++;
            num = num/2;
        }

        System.out.println(count);


    }

    public static void main(String args[]){
        convertBinary(1);
    }
}
