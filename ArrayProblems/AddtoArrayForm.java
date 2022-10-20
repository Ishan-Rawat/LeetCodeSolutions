/*
 * Prob title: 989. Add to Array-Form of Integer
 * Prob link: https://leetcode.com/problems/add-to-array-form-of-integer/
 */
package ArrayProblems;
import java.util.*;
/* Learned two approaches:
 * 1. Convert array to number, add, then convert back to array. O(n) complexity, still exceed time limit I guess cuz of the number of constant time operations
 * 2. Add K to n-1 position digit, save its units digit, pass on the rest to be added to next digit, till theres nothing left to add, I think O(n) time complexity,
 * but lesser constant time operations.
 */
public class AddtoArrayForm {
	public static void main(String args[]) {
		//nothing interesting in runner func, so leaving blank
	}
	static List<Integer> addToArrayForm (int[] num, int k){
		ArrayList<Integer> ans = new ArrayList<Integer>(10);
        int i = num.length-1;
        while(i>=0 || k>0){
            if(i>=0){
                int sum = num[i] +k;
                ans.add(sum%10);
                k = sum/10;
                i--;
            }
            else{
                ans.add(k%10);
                k /= 10;
            }
        }
        Collections.reverse(ans);
        return ans;
	}
}
