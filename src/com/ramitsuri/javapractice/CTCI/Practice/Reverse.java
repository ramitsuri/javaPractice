package com.ramitsuri.javapractice.CTCI.Practice;

/**
 * Created by ramitsuri on 2/29/16.
 */
import java.util.*;

public class Reverse {

    public static void main(String args[]){
        for(int i:reverse(new int[]{1,2,3,4,5,6,7})){
            System.out.println(i);
        }
    }

    public static int[] reverse(int[] arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i=i+1;
            j=j-1;
        }
        return arr;
    }
}
