package ArrayProblems;
/*
 * Problem title: 1832. Check if the Sentence Is Pangram
 * Link: https://leetcode.com/problems/check-if-the-sentence-is-pangram/
 */
//This is a O(n) time complexity solution. All other solutions discussed on LeetCode are O(n) time complexity solutions as well.
public class Pangram {
	public static void main(String args[]) {
		System.out.println(checker("thequickbrownfoxjumpsoverthelazydog"));
		System.out.println(checker("bruhmoment"));
		System.out.println(checker("twodrivenjockshelpfaxmybigquiz"));
	}
	//Bruteforce solution:
	//Depending upon the input I guess its prone to array out of bounds exception
	static boolean checker(String sentence) {
		boolean[] arr = new boolean[26];
		//gotta remember that the decimal value for 'a' in ASCII table is 97 
		for(int i=0; i<sentence.length();i++) {
			arr[sentence.charAt(i)%97]=true; //apparently char to int is implicit conversion 
		}
		
		for(int i=0; i<26; i++) {
			if(arr[i]==false)return false;
		}
		return true;
	}
}
