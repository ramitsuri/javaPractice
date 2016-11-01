package com.ramitsuri.javapractice.LeetCode;

/**
 * Created by ramitsuri on 3/14/16.
 */

/**
 * There are two sorted arrays nums1 and nums2 of size m and n respectively. Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 */
public class Median {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] nums = new int[nums1.length + nums2.length];
        int i=0,j=0,k = 0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i] < nums2[j]){
                nums[k] = nums1[i];
                i = i+1;
            }
            else if(nums2[j] <= nums1[i]){
                nums[k] = nums2[j];
                j = j+1;
            }
            k = k+1;
        }

        if(i<=nums1.length-1){
            for(int a = i;a<nums1.length;a++){
                nums[k] = nums1[a];
                k = k+1;
            }
        }

        if(j<=nums2.length-1){
            for(int a=j;a<nums2.length;a++){
                nums[k] = nums2[a];
                k = k+1;
            }
        }

        int mid = nums2.length + (nums1.length - nums2.length)/2;

        if((nums2.length + nums1.length)%2 == 0){
            double ds = ((double)nums[mid] + (double)nums[mid-1])/2;
            return ds;
        }
        else
            return (double)nums[mid-1]/2;
    }

    public static void main(String args[]){
        int[] a = {2};
        int[] b = {};
        System.out.println(findMedianSortedArrays(a,b));
    }
}
