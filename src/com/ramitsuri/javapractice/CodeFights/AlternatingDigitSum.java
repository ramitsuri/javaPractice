package com.ramitsuri.javapractice.CodeFights;

/**
 * Created by ramitsuri on 10/31/2016.
 * Define the alternating digit sum of number "abc..xyz" as z - y + x - ... a, where a ... z are the digits the number consists of.

 Given an integer n, your task is to find the alternating digit sum of n! and return it modulo 11.

 Example

 For n = 4, the output should be
 AlternatingDigitSum(n) = 2.

 4! = 24, its alternating digit sum is equal to 2, and 2 % 11 = 2, which is the answer.

 Input/Output

 [time limit] 3000ms (java)
 [input] integer n

 Constraints
 0 ≤ n ≤ 109.

 [output] integer

 The alternating digit sum of n! modulo 11.
 */
public class AlternatingDigitSum {
    int AlternatingDigitSum(int n) {
        long factorial = Factorial(n);
        int count = 0;
        long sum = 0;
        while(factorial!=0){
            long z = factorial%10;
            factorial = factorial/10;
            int sign = 1;
            if(count%2==1)
                sign = -1;
            sum = sum + sign*z;
            count++;
        }
        if(sum < 0)
            return (int)(11 - (-1*sum)%11);
        return (int)(sum%11);
    }

    long Factorial(int n){
        long factorial = 1;
        while(n>0){
            factorial = factorial * n;
            n = n - 1;
        }
        return factorial;
    }

    public static void main(String args[]){
        AlternatingDigitSum a = new AlternatingDigitSum();
        System.out.println(a.AlternatingDigitSum(14));
    }
}
