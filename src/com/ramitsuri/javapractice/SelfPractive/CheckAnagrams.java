package com.ramitsuri.javapractice.SelfPractive;

import java.util.Arrays;

/**
 * Created by ramitsuri on 1/17/16.
 */
public class CheckAnagrams {

    public static void main(String args[]){
        System.out.println(check("gele","egel "));
    }

    public static boolean check(String s1, String s2 ){
        s1 = sort(s1);
        s2 = sort(s2);
        return s1.equals(s2);
    }

    public static String sort(String s){
        char[] sa = s.toCharArray();

        Arrays.sort(sa);
        return new String(sa);
    }
}
