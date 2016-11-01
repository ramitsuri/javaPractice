package com.ramitsuri.javapractice.ZapposHR;

/**
 * Created by ramitsuri on 2/7/16.
 */

/**
 * for a given number of cuts, find max 1x1 squares that can be cut in a large rectangle using exactly those number of cuts
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class ChocolateBarCuts {

    static void max_Chocolates(int[] arr) {
        for(int i=0; i<arr.length;i++){
            BigInteger numOfCuts = BigInteger.valueOf(arr[i]);
            BigInteger hor = numOfCuts.divide(BigInteger.valueOf(2));
            BigInteger cuts = hor.multiply(numOfCuts.subtract(hor));
            System.out.println(cuts);
        }

    }




    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int _arr_size = 0;
        _arr_size = Integer.parseInt(in.nextLine());
        int[] _arr = new int[_arr_size];
        int _arr_item;
        for(int _arr_i = 0; _arr_i < _arr_size; _arr_i++) {
            _arr_item = Integer.parseInt(in.nextLine());
            _arr[_arr_i] = _arr_item;
        }

        max_Chocolates(_arr);

    }
}
