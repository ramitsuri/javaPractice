	package CTCI;
/**
 * Implement a method to perform basic string compression using the counts
of repeated characters. For example, the string aabcccccaaa would become
a2blc5a3. If the "compressed" string would not become smaller than the orig-
inal string, your method should return the original string
 * @author ramit
 *
 */
public class Chap1Prob5 {
	public static void main(String args[]){
		System.out.println(compress("aaaabccde"));
	}
	
	public static String compress(String str){
		
		int i=0;
		StringBuffer compressed = new StringBuffer();
		while(i<str.length()){
			char c = str.charAt(i);
			i=i+1;
			int count = 1;
			while(i<str.length()&&c == str.charAt(i)){
				count = count + 1;
				i=i+1;
			}			
			compressed.append(c);
			compressed.append(count);
		}
			return compressed.toString();
	}
}
