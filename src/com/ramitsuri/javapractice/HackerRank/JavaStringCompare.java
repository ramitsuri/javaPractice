package com.ramitsuri.javapractice.HackerRank;
import java.util.*;
/**
 * Created by ramitsuri on 1/14/16.
 */
public class JavaStringCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int count = scanner.nextInt();
        String minString = text.substring(0, count);
        String maxString = text.substring(0, count);
        for (int i = 0; i < text.length() - count+1; i++) {
            String subString = text.substring(i, i + count);
            if (subString.compareTo(minString) < 0)
                minString = subString;
            if (subString.compareTo(maxString) > 0)
                maxString = subString;
        }
        System.out.println(minString);
        System.out.println(maxString);
    }
}
