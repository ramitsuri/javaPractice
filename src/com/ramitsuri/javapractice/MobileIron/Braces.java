package com.ramitsuri.javapractice.MobileIron;

import java.util.Stack;

/**
 * Created by ramitsuri on 4/8/16.
 */
public class Braces {
    static String[] Braces(String[] values) {
        String[] res = new String[values.length];
        int i=0;
        for (String s: values) {
            res[i] = "NO";
            Stack<Character> stack = new Stack();
            for (char c:s.toCharArray()) {
                if(c == '(' || c == '[' || c == '{')
                    stack.push(c);
                else if(c == ')' || c == ']' || c == '}')
                {
                    char popped = stack.pop();
                    if(c == '(' && popped != ')')
                        res[i] = "NO";
                    else if(c == '{' && popped != '}')
                        res[i] = "NO";
                    else if(c == '[' && popped != ']')
                        res[i] = "NO";
                    else
                        res[i] = "YES";

                }
            }

            if(!stack.isEmpty())
                res[i] = "NO";
            i=i+1;

        }
        return res;
    }

    public static void main(String args[]){
        Braces(new String []{"{}[]{}[]","()()(["});
    }
}
