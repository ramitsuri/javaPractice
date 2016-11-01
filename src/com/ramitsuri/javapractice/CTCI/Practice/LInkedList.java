package com.ramitsuri.javapractice.CTCI.Practice;

/**
 * Created by ramitsuri on 2/17/16.
 */
//Single LL
public class LInkedList {
    public class Node {
        int val;
        Node next = null;

        Node(int val) {
            this.val = val;
        }


        void addToTail(int val) {
            Node newNode = new Node(val);
            Node n = this;
            while(n.next!=null){
                n=n.next;
            }
            n.next = newNode;
        }
    }
}
