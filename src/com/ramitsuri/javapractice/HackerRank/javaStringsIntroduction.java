package com.ramitsuri.javapractice.HackerRank;

import java.util.*;
/**
 * Created by ramitsuri on 1/14/16.
 */
public class javaStringsIntroduction {
    public static void main(String args[]){
        String hellp = "hello";
        System.out.println(hellp.compareTo("z"));
        System.out.println(hellp.substring(0,3));
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String second ="";
        if(scanner.hasNext())
            second=scanner.nextLine();
        else{
            second = first.split(" ")[1];
            first  = first.split(" ")[0];

        }
        boolean determined = false;
        int i=0;
        int diff = 0;
        while(!determined && i<Math.min(first.length(), second.length())){
            diff = first.charAt(i)-second.charAt(i);
            if(diff!=0)
               determined = true;
            i++;
        }
        System.out.println(first.length()+second.length());
        if(diff>0){
            System.out.println("Yes");

        }
        else if(diff<0)
            System.out.println("No");
        else  {
            if(first.length()<second.length())
                System.out.println("No");
            else if (first.length()>second.length())
                System.out.println("Yes");
            else if(first.equals(second))
                System.out.println("No");

        }
        System.out.println(first.substring(0,1).toUpperCase() + first.substring(1) + " " + second.substring(0,1).toUpperCase() +second.substring(1));
    }
}
