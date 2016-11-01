package com.ramitsuri.javapractice.HackerRank;

/**
 * Created by ramitsuri on 1/14/16.
 */
import java.util.*;
public class JavaAnagrams {


    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);
        String a = scanner.nextLine().toLowerCase();
        String b = scanner.nextLine().toLowerCase();
        if(isAnagram(a,b))
            System.out.println("Anagrams");
        else
            System.out.println("Not Anagrams");
    }

    public static boolean isAnagram(String a, String b){


        char[] aRray = a.toCharArray();
        char[] bRay = b.toCharArray();
        Arrays.sort(aRray);
        Arrays.sort(bRay);
        return Arrays.equals(aRray,bRay);
    }
}
