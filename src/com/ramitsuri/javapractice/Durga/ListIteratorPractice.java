package com.ramitsuri.javapractice.Durga;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by ramitsuri on 12/28/15.
 */
public class ListIteratorPractice {
    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        for(int i=0;i<10;i++){
            ll.add(Integer.toString(i));
        }

        ListIterator li = ll.listIterator();
        while (li.hasNext()){
            System.out.println(li.next());
            String str = (String) li.next();
            if(str.equals("3")){
                li.remove();
            }
            if(str.equals("5")){
               li.add("16");
                li.add("17");
            }
            if(str.equals("16")||str.equals("17")){
                li.set("100");
            }
        }
        System.out.println(ll);
    }
}
