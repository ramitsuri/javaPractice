package com.ramitsuri.javapractice.FooBar;

/**
 * Created by ramitsuri on 1/4/16.
 */

import sun.nio.cs.StreamDecoder;
import sun.nio.cs.StreamEncoder;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Peculiar balance
 * ================
 * <p/>
 * Can we save them? Beta Rabbit is trying to break into a lab that contains the only known zombie cure - but there's an obstacle. The door will only open if a challenge is solved correctly. The future of the zombified rabbit population is at stake, so Beta reads the challenge: There is a scale with an object on the left-hand side, whose mass is given in some number of units. Predictably, the task is to balance the two sides. But there is a catch: You only have this peculiar weight set, having masses 1, 3, 9, 27, ... units. That is, one for each power of 3. Being a brilliant mathematician, Beta Rabbit quickly discovers that any number of units of mass can be balanced exactly using this set.
 * <p/>
 * To help Beta get into the room, write a method called answer(x), which outputs a list of strings representing where the weights should be placed, in order for the two sides to be balanced, assuming that weight on the left has mass x units.
 * <p/>
 * The first element of the output list should correspond to the 1-unit weight, the second element to the 3-unit weight, and so on. Each string is one of:
 * <p/>
 * "L" : put weight on left-hand side
 * "R" : put weight on right-hand side
 * "-" : do not use weight
 * <p/>
 * To ensure that the output is the smallest possible, the last element of the list must not be "-".
 * <p/>
 * x will always be a positive integer, no larger than 1000000000.
 * <p/>
 * Languages
 * =========
 * <p/>
 * To provide a Python solution, edit solution.py
 * To provide a Java solution, edit solution.java
 * <p/>
 * Test cases
 * ==========
 * <p/>
 * Inputs:
 * (int) x = 2
 * Output:
 * (string list) ["L", "R"]
 * <p/>
 * Inputs:
 * (int) x = 8
 * Output:
 * (string list) ["L", "-", "R"]
 * <p/>
 * Use verify [file] to test your solution and see how it does. When you are finished editing your code, use submit [file] to submit your answer. If your solution passes the test cases, it will be removed from your home folder.
 */
public class PeculiarBalance {

    public static void main(String[] args) {

        String[] arr = answer(2);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    public static String[] answer(int x) {

        ArrayList<String> output = new ArrayList<String>();

        int lastWeight = getClosestWeight(x);
        int leftSum = x;
        int rightSum = lastWeight;
        output.add("R");
        double powerOfLastWeight = Math.log(lastWeight) / Math.log(3);
        while ((leftSum != rightSum) && lastWeight / 3 != 1) {
            int differenceToCover = rightSum - leftSum;
            lastWeight = lastWeight / 3;
            powerOfLastWeight = powerOfLastWeight - 1;
            if (differenceToCover > 0) {
                if (differenceToCover > lastWeight) {
                    output.add("L");
                    leftSum = leftSum + lastWeight;
                } else if (differenceToCover > (lastWeight - 1) / 2) {
                    output.add("L");
                    leftSum = leftSum + lastWeight;
                } else
                    output.add("-");
            } else if (differenceToCover < 0) {
                differenceToCover = Math.abs(differenceToCover);
                if (differenceToCover > lastWeight) {
                    output.add("R");
                    rightSum = rightSum + lastWeight;
                } else if (differenceToCover > (lastWeight - 1) / 2) {
                    output.add("R");
                    rightSum = rightSum + lastWeight;
                } else
                    output.add("-");
            }

        }
        if (x % 3 == 0) {
            output.add("-");
        } else if (x % 3 == 1) {
            output.add("R");
        } else if (x % 3 == 2) {
            output.add("L");
        }
        Collections.reverse(output);
        String[] outputArray = new String[output.size()];
        return output.toArray(outputArray);
    }

    public static int getClosestWeight(int x) {

        double y = Math.floor(Math.log(x) / Math.log(3));

        int closest = (int) Math.pow(3, y);
        if (x > ((closest * 3 - 1) / 2)) {
            closest = closest * 3;
        }
        return closest;
    }
}
