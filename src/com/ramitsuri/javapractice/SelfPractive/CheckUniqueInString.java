package com.ramitsuri.javapractice.SelfPractive;

/**
 * Created by ramitsuri on 1/17/16.
 */

/**
 *  Implement an algorithm to determine if a string has all unique characters. What if
 you cannot use additional data structures?
 */
public class CheckUniqueInString {
    public static void main(String args[]){
        System.out.println(hasUnique("aA"));
    }

    public static boolean hasUnique(String s){
        boolean[] charBooleans = new boolean[256];
        for(int i=0;i<s.length();i++){
            int vv = s.charAt(i);
            if(charBooleans[vv] == true)
                return false;
            charBooleans[vv] = true;
        }

        return true;
    }
}
