package leetcode; /**
 * Created by ramitsuri on 10/31/2016.
 */
import leetcode.ReverseInt;
public class PalindromeInt {

    static boolean isPalindrome(int number){
        int reverseNumber = ReverseInt.reverseInt(number);
        return (number - reverseNumber == 0);
    }
    public static void main(String args[]){
        System.out.println(isPalindrome(10010));
        int v = 11; //01011
        int u = 21; //10101
        int x = 0b0000;
        for(int i = 0; i<1<<4; i++) {
            for(int k = 0; k<4;k++){
                int result = (1<<k) & i;
                if(result!=0){
                    System.out.print(result+" ");
                }
            }
            System.out.println();
        }
        System.out.println(Integer.toBinaryString(10));
    }


}
