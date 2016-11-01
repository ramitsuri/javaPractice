package com.ramitsuri.javapractice.SelfPractive;

/**
 * Created by ramitsuri on 3/1/16.
 */import java.util.*;

public class SubString{
    public static int subString(String source, String target){
        int i=0;
        int j=0;
        boolean isSubString = false;
        while(j<target.toCharArray().length && i<source.toCharArray().length){
            if(source.charAt(i)!=target.charAt(j)){
                isSubString = false;
                j=0;
            }
            else{
                j=j+1;
                isSubString = true;
            }
            i=i+1;
        }
        if(isSubString){
            return i-target.length();
        }
        else
            return -1;
    }
    public static void main(String args[]){
        System.out.println(subString("heyyylo","lo"));
    }}