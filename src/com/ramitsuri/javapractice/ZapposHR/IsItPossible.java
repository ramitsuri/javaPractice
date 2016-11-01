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
 * given (a,b),, (c,d) you can perform operations
 * (x,y) -> (x+y,y) or
 * (x,y) -> (x,x+y)
 *
 * find if it is possible to reach (c,d) starting from (a,b)
 */
public class IsItPossible {
    static String isitpossible(int a, int b, int c, int d) {


        if(a==c && b==d) {
            return "Yes";
        }
        while((a!=c || b!=d) && c!=d){
            if(c>d)
                c = c-d;
            else
                d = d-c;
        }

        if(a==c && b==d) {
            return "Yes";
        }
        else {
            return "No";
        }
    }

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int _a;
        _a = Integer.parseInt(in.nextLine());

        int _b;
        _b = Integer.parseInt(in.nextLine());

        int _c;
        _c = Integer.parseInt(in.nextLine());

        int _d;
        _d = Integer.parseInt(in.nextLine());

        System.out.println(isitpossible(_a, _b, _c, _d));
    }
}
