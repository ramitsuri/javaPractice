package com.ramitsuri.javapractice.ZapposHR;

/**
 * Created by ramitsuri on 2/7/16.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * for a given number of strings, find how many operations will it take to make the stirng a palindrome
 * you can only decrease the calue of a string and not increase it
 * ex: accb can be changed to acca in 1 operation by reducing b to a
 *
 */

public class LoveLetterPalindrome {

    static void mystery(String[] letter) {
        for(String l:letter){
            System.out.println(calculateNumOfOperations(l));
        }
    }

    private static int calculateNumOfOperations(String substring) {
        int numOfOperations = 0;
        int i=0;
        int j=substring.length()-1;
        while(i<substring.length()/2 && j>=substring.length()/2) {
            int difference = Math.abs(substring.charAt(i)- substring.charAt(j));
            numOfOperations = numOfOperations + difference;
            i = i + 1;
            j = j - 1;
        }
        return numOfOperations;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int _letter_size = 0;
        _letter_size = Integer.parseInt(in.nextLine());
        String[] _letter = new String[_letter_size];
        String _letter_item;
        for(int _letter_i = 0; _letter_i < _letter_size; _letter_i++) {
            try {
                _letter_item = in.nextLine();
            } catch (Exception e) {
                _letter_item = null;
            }
            _letter[_letter_i] = _letter_item;
        }

        mystery(_letter);

    }
}
