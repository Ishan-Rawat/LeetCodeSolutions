/*
 * Problem title: 53. Maximum Subarray 
 * Problem link: https://leetcode.com/problems/maximum-subarray/submissions/
 */
package ArrayProblems;

public class maxSumContSubArr {
	public static void main(String args[]) {
		//Kinda boring to do this so leaving alone
	}
	// The following approach is known as Kadane's algo. Better than bruteforce but now the best approach (that would be divide and conquer IG)
	static int maxSumContSubarr(int[] arr) {
		int maxSum = Integer.MIN_VALUE;
		int currSum = 0;
		
		for(int i=0; i<arr.length; i++) {
			currSum += arr[i];
			if(currSum > maxSum)maxSum = currSum;
			if(currSum < 0)currSum = 0;
		}
		return maxSum;
	}
}
