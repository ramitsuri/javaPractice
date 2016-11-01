package com.ramitsuri.javapractice.CTCI.Practice;

import java.util.HashMap;

/**
 * Created by ramitsuri on 2/28/16.
 * There is an array with every element repeated twice except one. Find that elemen

 Read more: http://javarevisited.blogspot.com/2015/06/top-20-array-interview-questions-and-answers.html#ixzz41WpGTEjA
 */
public class Arraytest {
    public static void main (String args[]){
        int[] arrv = new int[9];

        for(int i =1;i<=arrv.length;i++){
            arrv[i-1] = (i+1)/2;
            System.out.println(arrv[i-1]);
        }

        System.out.println(findDuplicate(arrv));

    }

    public static int findDuplicate(int[] arr){

        boolean[] arrr= new boolean[arr.length];
        for(int i:arr){
            if(arrr[i])
                arrr[i] = false;
            else
                arrr[i] = true;
        }
        int c=0;
        for(boolean val:arrr){
            if(val)
                break;
            c = c+1;
        }
        return c;
    }

    /**
     * How to rearrange array in alternating positive and negative number

     Read more: http://javarevisited.blogspot.com/2015/06/top-20-array-interview-questions-and-answers.html#ixzz41XAk4RaH
     * @param arr
     * @return
     */
    public static int[]  rearrange(int[] arr){

        int[] arrRe = new int[arr.length];
        int i=0;
        int j=1;
        for (int val:arr){
            if(val>0){
                arrRe[i] = val;
                i=i+2;
            }
            if(val<0){
                arrRe[j] = val;
                j=j+2;
            }
        }
        return arrRe;
    }

}
