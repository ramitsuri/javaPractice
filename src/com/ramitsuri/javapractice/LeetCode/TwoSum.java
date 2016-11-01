package com.ramitsuri.javapractice.LeetCode;

/**
 * Created by ramitsuri on 2/16/16.
 */

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

 You may assume that each input would have exactly one solution.

 Example:
 Given nums = [2, 7, 11, 15], target = 9,

 Because nums[0] + nums[1] = 2 + 7 = 9,
 return [0, 1].
 */
import java.util.*;
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = 0;
        result[1] = 0;
        HashMap map = new HashMap<Integer,Integer>();
        for(int i = 0; i<nums.length;i++){
            if(map.containsKey(nums[i])){
                result[0] = (int)map.get(nums[i]);
                result[1] = i;
                return result;
            }
            else{
                map.put(target-nums[i],i);
            }
        }
        return result;
    }

    public static void main(String args[]){
        TwoSum tw = new TwoSum();
        int[] arr = {2,3,4,5,6};
        arr = tw.twoSum(arr, 6);
        for(int ar:arr){
            System.out.println(ar);
        }

    }
}
