package onboarding.utils;

import java.util.List;

public class ArrayList {
	public static void main(String[] args) {
		// can't put primitive, only put non - primitive
		java.util.ArrayList<Integer> number = new java.util.ArrayList<Integer>();
		// adding
		number.add(20);
		number.add(100);
		number.add(40);
		// Retrieving
		System.out.println(number.get(1));

		System.out.println("\n Interation #1");
		// Indexed for loop iteration
		for (int i = 0; i < number.size(); i++) {
			System.out.println(number.get(i));
		}

		// Removing item (careful!)
		number.remove(number.size() - 1);
		// This is very Slow, with a big arraylist, So we should use LinkList
		// (truy xuat truc tiep den vi tri)
		number.remove(0);

		System.out.println("\n Interation #2");
		for (Integer value : number) {
			System.out.println(value);
		}
		
		//List Interface..
		List<String> value = new java.util.ArrayList<String>();

	}
}
