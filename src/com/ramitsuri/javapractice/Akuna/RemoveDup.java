package com.ramitsuri.javapractice.Akuna;

import java.util.*;

/**
 * Created by ramitsuri on 2/29/16.
 */
public class RemoveDup {

    public static int[] removedup(int[] arr){
        HashSet hashSet = new HashSet();

        for (int a:arr){
            hashSet.add(a);
        }
        ArrayList<Integer> arrList = new ArrayList();
        for(Iterator<Integer> it = hashSet.iterator(); it.hasNext();){
            arrList.add(it.next());
        }
        Collections.sort(arrList);
        Collections.reverse(arrList);
        int j=0;
        arr = new int[arrList.size()];
        for(int i:arrList){
            arr[j] = i;
            j+=1;
        }
        return arr;
    }

    public static void main(String args[]){
        int[] aa =new int[8];
        aa     = removedup(new int[]{3,4,5,6,2,3,1,1});

        for(int a:aa){
            System.out.print(a);
        }
    }
}
