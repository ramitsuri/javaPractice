package com.ramitsuri.javapractice;
import java.util.Scanner;
/**
 * Created by ramit on 11/19/2015.
 */
public class Excel {
    public static void main(String[] args)
    {

        int arr[] = new int[16];
        int lastValue = 0;
        Scanner stdin = new Scanner(System.in);
        while(stdin.hasNextLine())
        {
            int i=0;

            int valueToConvert = Integer.parseInt(stdin.nextLine());
            int rem = valueToConvert%26;
            while(valueToConvert>26){
                rem = valueToConvert%26;
                valueToConvert = valueToConvert/26;
                arr[i] = valueToConvert;
                i++;
            }
            lastValue = rem;
            arr[i] = lastValue;
            check(arr);
            System.out.println(stdin.nextLine());
        }
        stdin.close();
    }

    private static void check(int[] arr) {
        if(arr.length==1){
            System.out.println((char)(64+arr[0]));
        }
        else if(arr.length==2){
            System.out.println(((char) (64 + arr[0])) + ((char)(64+arr[1])));
        }
        else if(arr.length==3){

        }
        else if(arr.length==4){

        }
    }

}
