/*
 * Problem title: 1773. Count Items Matching a Rule
 * Problem link: https://leetcode.com/problems/count-items-matching-a-rule/
 */
package ArrayProblems;
import java.util.*;

public class ItemsMatchingRule {
	public static void main(String args[]) {
		//ArrayList is a class that implements the List interface
		List<List<String>> items = new ArrayList<List<String>>();
		List<String> inner1 = new ArrayList<String>();
		List<String> inner2 = new ArrayList<String>();
		List<String> inner3 = new ArrayList<String>();
		
		inner1.add("phone");
		inner1.add("blue");
		inner1.add("pixel");
		items.add(inner1);
		
		inner2.add("Computer");
		inner2.add("Silver");
		inner2.add("Lenovo");
		items.add(inner2);
		
		inner3.add("phone");
		inner3.add("Gold");
		inner3.add("Iphonee");
		items.add(inner3);
		
		System.out.println(items);
	}
	
}
