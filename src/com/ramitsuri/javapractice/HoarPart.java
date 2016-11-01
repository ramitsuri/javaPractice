package com.ramitsuri.javapractice;

/**
 * Created by ramit on 9/5/2015.
 */
public class HoarPart {
    static int partition(int a[]) {
        int x=a[0];
        int p=0;
        int r=a.length-1;
        int iteration=0;
        int i=p-1;
        int j=r+1;
        while (true) {
            iteration++;
            do{
                j--;
                System.out.println("while1 "+iteration + " " + i+" " + j);
            }while(a[j]>x);
            do{
                i++;
                System.out.println("while2 "+iteration+" "+i +" " +j);
            }while(a[i]<x);
            if(i<j){
                a[i]+=a[j];
                a[j]=a[i]-a[j];
                a[i]=a[i]-a[j];
                for(int k=0;k<a.length;k++){
                    System.out.print(a[k]+", ");
                }
                System.out.print("\n");
            }
            else {
                return j;
            }
            }
        }

    public static void main(String[] args){
        int[] arr= {13,19,9,5,12,8,7,4,11,2,6,21};
        //int[] arr= {13,19,9};
        int j= partition(arr);
        System.out.println(j);
    }
}
