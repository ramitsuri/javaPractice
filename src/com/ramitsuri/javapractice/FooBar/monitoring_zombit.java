package com.ramitsuri.javapractice.FooBar;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by ramit on 11/19/2015.
 */
public class monitoring_zombit {
    public static int answer(int[][] intervals) {
        // Your code goes here.
        int result = intervals.length;
        java.util.Arrays.sort(intervals, new java.util.Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[0], b[0]);
            }
        });
        int minVal = intervals[0][0];
        int maxVal = intervals[0][1];
        int timeMonitored = maxVal - minVal;
        for(int i=1; i< intervals.length;i++){
                if(intervals[i][1]>maxVal){
                    timeMonitored += intervals[i][1] - maxVal;
                    maxVal = intervals[i][1];
                }
                if(intervals[i][0]>maxVal){
                    timeMonitored+= intervals[i][1] - intervals[i][0];
                }

        }
        return timeMonitored;
    }


    public static void main(String[] args){
        int[][] intervals = new int[][] {{1, 3}, {3, 6}};
        System.out.println(answer(intervals));
    }
}
