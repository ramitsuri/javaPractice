package com.ramitsuri.javapractice.SelfPractive;

/**
 * Created by ramitsuri on 2/29/16.
 */
import java.util.*;
public class FirstNonRepeatingChar {



        public static char firstNon(String str){
            HashMap<Character, Integer> hashMap = new LinkedHashMap();
            for(char c:str.toCharArray()){
                if(hashMap.containsKey(c)){
                    hashMap.put(c,hashMap.get(c)+1);
                }
                else{
                    hashMap.put(c,1);
                }
            }
            char ch = '\0';
            for(Character c:hashMap.keySet()){
                if(hashMap.get(c)==1){
                    ch = c;
                    break;
                }
            }
            return ch;

        }

        public static void main(String args[]){
            System.out.println(firstNon("mmorning"));
        }
    }
