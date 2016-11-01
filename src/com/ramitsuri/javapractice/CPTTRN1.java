package com.ramitsuri.javapractice;

import java.util.*;
import java.lang.*;

/**
 * Created by ramit on 9/4/2015.
 */

public class CPTTRN1 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        String output="";
        for (int i = 0; i <= count; i++)
        {
            String next=scanner.nextLine();
if(!(next.equals("")||(next.equals("\n")))){
            String[] patternCount = next.split(" ");

            int j = Integer.parseInt(patternCount[0]);
            int k = Integer.parseInt(patternCount[1]);
            for(int countJ=0;countJ<j;countJ++){
                for(int countK=0;countK<k;countK++){
                   if((countJ+countK)%2==0)
                       output+="*";
                   else
                       output+=".";
                }
                output+="\n\n";
            }
        }

        }
        System.out.println(output);
    }
}


