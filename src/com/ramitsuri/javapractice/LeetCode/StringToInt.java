package leetcode;

/**
 * Created by ramitsuri on 10/31/2016.
 */
public class StringToInt {
    public static int myAtoi(String str) {
        int result = 0;
        if(str.length()<1)
            return 0;
        char[] strArray = str.toCharArray();

        for(char c: strArray){
            int i = (int)c - 48;
            result = result*10;
            result = result + i;
        }
        return result;
    }
    public static void main(String args[]){
        System.out.print(myAtoi("321"));
    }
}
