package com.ramitsuri.javapractice.LeetCode;

/**
 * Created by ramitsuri on 2/16/16.
 */

/**
 * You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

 Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 Output: 7 -> 0 -> 8
 */
public class AddTwoNumbers
{
    public static class ListNode {
             int val;
             ListNode next;
             ListNode(int x) { val = x; }
        }
    public static class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode l3 = new ListNode(l1.val+l2.val );
            while(l1.next!=null || l2.next!=null){
                l1 = l1.next;
                l2 = l2.next;
                l3 = l3.next;
                l3 = new ListNode(l1.val + l2.val);

            }
return l3;
        }
    }

    public static void main(String args[]){
        Solution s = new Solution();
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        ListNode l3 = s.addTwoNumbers(l1,l2);
        System.out.print("s");
    }
}
