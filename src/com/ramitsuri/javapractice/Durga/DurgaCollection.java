package com.ramitsuri.javapractice.Durga;

import java.util.ArrayList;

/**
 * Created by ramitsuri on 12/23/15.
 */
public class DurgaCollection {

    public static void main(String args[]){
        ArrayList l =  new ArrayList();
        l.add("A");
        l.add(1);
        l.add(null);
        l.add("a");
        l.add("A");
        System.out.println(l);
        l.remove("A");
        System.out.println(l);
        System.out.println(l.indexOf("a"));
        l.add(2, "a");
        System.out.println(l);
        l.remove("1");
        System.out.println(l);
    }
}

