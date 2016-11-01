package com.ramitsuri.javapractice.HackerRank;

/**
 * Created by ramitsuri on 1/14/16.
 */
import java.util.*;
public class StringPalindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        boolean isPalindrome = true;

        int i=0;
        int j=A.length()-1;
        while(isPalindrome && i<A.length()/2 && j>=A.length()/2){
            if(A.charAt(i)!=A.charAt(j))
                isPalindrome = false;
            i = i+1;
            j = j-1;
        }
        if(isPalindrome)
            System.out.println("Yes");
        else
            System.out.print("No");
    }
}
