package com.ramitsuri.javapractice.CTCI.Problems;
import java.util.*;
class Chap1Prob8 {
  public static void main(String args[]){
    System.out.println(rotation("waterbottle","erbottle"));
  }

  public static boolean rotation(String s1, String s2){
    if(s1.length()!=s2.length())
      return false;
    s1 = s1+s1;
      return s1.contains(s2);
  }
}
