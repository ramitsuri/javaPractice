package com.ramitsuri.javapractice.HackerEarth;

/**
 * Created by ramitsuri on 2/15/16.
 */

import java.util.*;
public class SortArray {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
            System.out.println("hello world");
        }
        */
        Scanner scanner = new Scanner(System.in);
        int numOfTest = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<numOfTest;i++){
            int numOfElements = scanner.nextInt();
            ArrayList<Integer> array = new ArrayList<Integer>();
            int array1[] = new int[numOfElements];
            int a=array1.length;
            String ds = "dsdsds";
            a = ds.length();
            for(int j=0;j<numOfElements;j++){
                array.add(scanner.nextInt());
            }
            Collections.sort(array);
            Collections.reverse(array);
            //Arrays.sort(array);
            for(Integer element:array){
                sb.append(element + " ");
            }
            sb.append("\n");
            //int [numOfElements] array = scanner.nextLine().split(" ")
        }
        HashMap hash = new HashMap<Integer,Integer>();
        Integer sd = 0;
        int sds = sd;
        System.out.println(sb);
    }
}
