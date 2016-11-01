package com.ramitsuri.javapractice;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by ramit on 9/10/2015.
 */
public class ONP {

    public static void main(String args[]) {

        /*Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        String output = "";
        boolean isOpen=false;
        String alphabet ="abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i <= count; i++)
        {
            Stack<Character> stackExpression = new Stack<>();
            String next = scanner.nextLine();
            for( int j=0;j<next.length();j++){
                char x=next.charAt(j);

                if(next.charAt(j)=='(')
                    isOpen=true;
                else if(alphabet.contains(next.charAt(j))){
                    stackExpression.push(x);
                    output+=x;
                }
                else if(x==')'){
                    isOpen=false;
                }
                else if(x=='*'||x=='^'){
                    if(!isOpen){
                        output+=x;
                    }
                }
                else if(x=='+'){
                    if(!isOpen){
                        output+=x;
                    }
                }



            }

        }*/
    }
}