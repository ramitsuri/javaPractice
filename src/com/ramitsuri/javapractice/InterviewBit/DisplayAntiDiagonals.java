package com.ramitsuri.javapractice.InterviewBit;

/**
 * Created by ramitsuri on 1/5/16.
 */

import java.util.ArrayList;

/**
 * Give a N*N square matrix, return an array of its anti-diagonals. Look at the example for more details.

 Example:


 Input:

 1 2 3
 4 5 6
 7 8 9

 Return the following :

 [
 [1],
 [2, 4],
 [3, 5, 7],
 [6, 8],
 [9]
 ]
 */
public class DisplayAntiDiagonals {
    public static ArrayList<ArrayList> PrintDiagonal(ArrayList<ArrayList> arr){

        ArrayList<ArrayList> arrayOutput = new ArrayList<ArrayList>();

        int[][] array = new int[arr.get(0).size()][arr.get(0).size()];
        for(int sum = 0; sum<= 2*arr.get(0).size() - 2; sum++){
            ArrayList arrayOutputInside = new ArrayList();
            for(int i=0; i<arr.get(0).size();i++){
                for(int j =0; j<arr.get(0).size(); j++ ){
                    if(i+j == sum){
                        arrayOutputInside.add(arr.get(i).get(j));
                    }
                }
            }
            arrayOutput.add(arrayOutputInside);
        }
        return arrayOutput;
    }

    public static void main(String args[]){
        ArrayList arrayList = new ArrayList();


        ArrayList arr = new ArrayList();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arrayList.add(arr);

        arr = new ArrayList();
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arrayList.add(arr);

        arr = new ArrayList();
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arrayList.add(arr);



        System.out.println(PrintDiagonal(arrayList));
    }
}
