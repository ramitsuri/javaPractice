package com.ramitsuri.javapractice.SelfPractive;

/**
 * Created by ramitsuri on 3/3/16.
 */
public class BinaryTree {
    public static class Node
    {
        int data;
        Node left, right;

        public Node(int item)
        {
            data = item;
            left = right = null;
        }
    }

    /* Class to find size of Binary Tree */

        Node root;

        /* Given a binary tree. Print its nodes in level order
           using array for implementing queue */
        int size()
        {
            return size(root);
        }

        /* computes number of nodes in tree */
        int size(Node node)
        {
            int size = 0;
            if (node == null)
                size = 0;
            else
                size = (size(node.left) + 1 + size(node.right));
            return size;
        }

        public static void main(String args[])
        {
            Integer a=78;
            char c = ((char)(int) a);
            System.out.print(c);
        /* creating a binary tree and entering the nodes */
            BinaryTree tree = new BinaryTree();
            tree.root = new Node(1);
            tree.root.left = new Node(2);
            tree.root.right = new Node(3);
            tree.root.left.left = new Node(4);
            tree.root.left.right = new Node(5);

            System.out.println("The size of binary tree is : "
                    + tree.size());
        }
    }

