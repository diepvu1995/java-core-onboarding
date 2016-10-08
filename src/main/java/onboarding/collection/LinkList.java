package onboarding.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkList {
	public static void main(String[] args) {
		/* ArrayList manage arrays internally*/
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		/* LinkList consists  of element where each element 
		 * has a reference to the previous and next element
		 * [0]-> [1] -> [2]....
		 * <-   <- */
		LinkedList<Integer> linkedList = new LinkedList<Integer>();

		doTiming("ArrayList", arrayList);
		doTiming("LinkList", linkedList);
	}

	private static void doTiming(String type, List<Integer> list) {
		for (int i = 0; i < 1E5; i++) {
			list.add(i);
		}
		long start = System.currentTimeMillis();
		/*
		//Add item at end of list, ArrayList beter
		for (int i = 0; i < 1E5; i++) {
			list.add(i);
		}
		*/
		
		//Add item else Where in list, LinkList better
		for (int i = 0; i < 1E5; i++) {
			list.add(0,i);
			// list.add(list.size() - 100, i); ArrayList wil be beter
		}
		
		long end = System.currentTimeMillis();
		System.out.println("Time taken: " + (end-start)+ " ns for" + type);
	}
}
