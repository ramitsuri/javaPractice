package com.ramitsuri.javapractice.InterviewBit;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by ramitsuri on 1/5/16.
 */
public class AddOneToNumAsArray {

    public static ArrayList Addition(ArrayList<Integer> arrayList){
        arrayList.set(arrayList.size()-1, arrayList.get(arrayList.size()-1) + 1);
        int i =  arrayList.size()-1;
        while(arrayList.get(i)==10 ){
            if(i!=0){
                arrayList.set(i, 0);
                i = i-1;
                arrayList.set(i, arrayList.get(i) + 1);
                if(i==0 && arrayList.get(i)==10){
                    Collections.reverse(arrayList);
                    arrayList.set(arrayList.size()-1, 0);
                    arrayList.add(1);
                    Collections.reverse(arrayList);
                }
            }
            else
                break;
        }
        return arrayList;
    }
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(9);
    /*    arr.add(9);
        arr.add(9);
        arr.add(9);
        arr.add(9);
        arr.add(9);*/
        System.out.println(Addition(arr));
    }
}
