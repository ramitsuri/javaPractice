package com.ramitsuri.javapractice.Durga;

import java.util.Vector;

/**
 * Created by ramitsuri on 12/24/15.
 */
public class VectorPractice {
    public static void main(String args[]){
        Vector v =  new Vector(10, 2);
        for(int i=0; i<10; i++){
            v.add(i);
        }
        System.out.println(v.capacity());
        v.add(12);
        System.out.println(v.capacity());
        System.out.println(v);
    }
}
