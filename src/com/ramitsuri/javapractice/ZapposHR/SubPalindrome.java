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
 * find count of all substrings of a given substring that are palindromes
 */
public class SubPalindrome {

    static int palindrome(String str) {
        Set palindromes = new HashSet();
        char [] charArray = str.toCharArray();
        for(char c: charArray){
            palindromes.add(c);
        }
        int i = 2;
        while(i<=str.length()){
            for(int j=0;j<=str.length()-i;j++){
                String stringToCheck =str.substring(j,j+i);
                if(checkPalindrome(stringToCheck)){
                    palindromes.add(stringToCheck);
                }
            }
            i=i+1;
        }
        return palindromes.size();
    }

    private static boolean checkPalindrome(String substring) {

        boolean isPalindrome = true;
        int i=0;
        int j=substring.length()-1;
        while(isPalindrome && i<substring.length()/2 && j>=substring.length()/2) {
            if (substring.charAt(i) != substring.charAt(j))
                isPalindrome = false;
            i = i + 1;
            j = j - 1;
        }
        return isPalindrome;
    }

    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        /*final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        int res;*/
        String _str;
        try {
            _str = in.nextLine();
        } catch (Exception e) {
            _str = null;
        }

        //res = palindrome(_str);

        System.out.println(palindrome(_str));
        //bw.write(String.valueOf(res));
        //bw.newLine();

        //bw.close();
    }
}