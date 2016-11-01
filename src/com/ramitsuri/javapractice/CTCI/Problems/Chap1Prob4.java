package CTCI;
/**
 * Write a method to replace all spaces in a string with'%20'. You may assume that
the string has sufficient space at the end of the string to hold the additional
characters, and that you are given the "true" length of the string. (Note: if imple-
menting in Java, please use a character array so that you can perform this opera-
tion in place.)
EXAMPLE
Input:
"Mr John Smith
Output: "Mr%20Dohn%20Smith"
 * @author ramit
 *
 */
public class Chap1Prob4 {
	
	public static void main(String args[]){
		char[] charArray = {'m','r',' ','j','o','h','n',' ','s','m','i', 't', 'h', ' ' , ' ', ' ', ' ' }; 
		charArray = replaceSpaces(charArray, 13);
		System.out.println(new String(charArray));
	}
	
	public static char[] replaceSpaces(char[] charArray, int length){
		
		int i=charArray.length-1;
		for(int j=length-1;j>=0;j--){
			if(charArray[j]!=' '){
				charArray[i] = charArray[j];
				i=i-1;
			}
			else{
				charArray[i] = '0';
				charArray[i-1] = '2';
				charArray[i-2] = '%';
				i=i-3;
			}
			if(i!=0){
				
			}
			
		}
		
		return charArray;
	}
}
