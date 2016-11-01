package com.ramitsuri.javapractice.Akuna;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by ramitsuri on 2/29/16.
 * find common in sorted order in two strings
 */
public class StringIntersect {

    public static void main(String args[]){
        System.out.print(IntersectStrings("aaabb","ab"));
    }
    static String IntersectStrings(String first, String second) {

        char[] firstChar = first.toCharArray();
        char[] secondChar = second.toCharArray();

        Arrays.sort(firstChar);
        Arrays.sort(secondChar);

        Map<Character, Integer> hash1 = compress(firstChar);
        Map<Character, Integer> hash2 = compress(secondChar);
        StringBuffer sb = new StringBuffer();
        for(Character c: hash1.keySet())  {
            if(hash2.containsKey(c)){
                int count1 = hash1.get(c);
                int count2 = hash2.get(c);

                sb.append(c);
                sb.append(Math.min(count1,count2));

            }
        }

        return unCompress(new String(sb));

    }

    static HashMap<Character, Integer> compress(char[] chars){
        int i=0;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        while(i<chars.length){
            char c = chars[i];
            i=i+1;
            int count = 1;
            while(i<chars.length&&c == chars[i]){
                count = count + 1;
                i=i+1;
            }
            hashMap.put(c,count);
        }
        return hashMap;
    }

    static String unCompress(String str){

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i=i+2){
            for(int j=0;j<(int)(str.charAt(i+1));j++){
                sb.append(str.charAt(i));
            }
        }
        return new String(sb);
    }


}
