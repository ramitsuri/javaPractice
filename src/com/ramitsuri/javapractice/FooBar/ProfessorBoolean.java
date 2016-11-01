package com.ramitsuri.javapractice.FooBar;

/**
 * Created by ramit on 11/19/2015.
 */
public class ProfessorBoolean {
    public static int answer(int x){
        if(x<0 || x>10)
            return 0;
        return (int)((Math.pow(7, x + 1) - 1)/6);
    }

    public static void main(String[] args){
        System.out.println(answer(-1));
    }
}
