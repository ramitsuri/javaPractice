package com.ramitsuri.javapractice.CTCI.Practice;

/**
 * Created by ramitsuri on 2/28/16.
 */
public class Singleton {

    private static Singleton instance = null;

    public Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
