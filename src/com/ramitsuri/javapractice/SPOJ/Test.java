package com.ramitsuri.javapractice.SPOJ;

/**
 * Created by ramitsuri on 1/14/16.
 */
import java.util.*;
public class Test {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numOfLines = scanner.nextInt();
        scanner.nextLine();
        int sum = 0;
        String sSum = "";
        for(int i=0;i<numOfLines;i++){
            String a = scanner.nextLine();
            sum = 0;
            for(int j=0;j<a.length();j++) {
                if (a.charAt(j) == '0' || a.charAt(j) == '9' ||a.charAt(j) == '6')
                    sum = sum + 1;
                if (a.charAt(j) == '8')
                    sum = sum + 2;
            }
            sSum = sSum + sum + "\n";
            }
        System.out.print(sSum);

        }

}
