package com.ramitsuri.javapractice.SelfPractive;

/**
 * Created by ramitsuri on 3/2/16.
 */
public class LinkedList {


    Node head;
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String args[]){

        LinkedList list = new LinkedList();
        Node first = new Node(2);
        list.head = first;
        Node second = new Node(3);
        first.next = second;
        Node third = new Node(4);
        second.next = third;
    }
}
