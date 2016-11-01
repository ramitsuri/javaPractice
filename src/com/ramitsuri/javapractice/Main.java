package com.ramitsuri.javapractice;

import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.util.*;
import java.lang.*;
//STRHH
public class Main {

    public static void main(String[] args) {

        Scanner reader= new Scanner(System.in);
        String output = "";
        int count =0;
        if(reader.hasNextInt()) {
            count = reader.nextInt();
        }       String[] words = new String[count+1];
        for(int j=0; j<=count;j++) {
            words[j] = reader.nextLine();
        }
        for(int i=0;i<=words.length;i++) {
            for (int k = 0; k < words[i].length() / 2; k += 2) {
                output += words[i].charAt(k);
            }
            output += "\n";
        }
        System.out.println(output);
    }
}
