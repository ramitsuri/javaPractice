package com.ramitsuri.javapractice.Durga;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by ramitsuri on 12/28/15.
 */
public class IteratorPractice {

    public static void main(String args[]){
    ArrayList al = new ArrayList();
    for (int i=0; i<10; i++){
        al.add(i);
    }
        System.out.println(al);
        Iterator i = al.iterator();
        while(i.hasNext()){
            Integer intt = (Integer) i.next();
            if(intt%2 == 0)
                i.remove();
        }
        System.out.println(al);
    }
}
