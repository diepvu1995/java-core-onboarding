package onboarding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestCollections {
	// array
		// array is an object
		// only use for primitive type: int, char, byte, short, float, double,
		// boolean, long

		// value of a : "primitive" array
		int[] a = new int[4];

		int[] b = new int[5];

		// Collection: object array

		// field/instance member => class member
		static int i = 5; // value of i : 5
		// value of l : memory address @#4122339 => memory cell: 10
		Integer l = new Integer(10);

		public static void main(String[] args) {
			// value of a: address menory cell A 1
			String a = "A";
			String b = "A";
			System.out.println(a == b + "");
			System.out.println(a.equals(b));

			// List interface: duplication/keep the insertion order
			// TODO: what is the difference between List implementations?
			// implementations: ArrayList, LinkedList
			List<String> lst = new ArrayList<String>();
			lst.add("A");
			lst.add("A");
			lst.add("B");
			lst.add("C");
			lst.add("D");
			// Set interface: non-duplication/not keep the insertion order
			// TODO: what is the difference between Set implementations?
			// 3 implementations: HashSet, LinkedHashSet, TreeSet
			//http://www.programcreek.com/2013/03/hashset-vs-treeset-vs-linkedhashset/
			//https://coderwall.com/p/yivzja/hashset-vs-linkedhashset-vs-treeset
			//http://javahungry.blogspot.com/2014/03/difference-between-hashset-and-treeset-similarities-and-example.html
			
			Set<String> set = new HashSet<String>();
			set.add("A");
			set.add("A");
			set.add("B");
			set.add("C");
			set.add("D");
			// Map interface: contain element under the form of <Key, Value>
			// TODO: what is the difference between Map implementations?
			// 3 implementations: HashMap, LinkedHashMap, TreeMap
			//http://www.programcreek.com/2013/03/hashmap-vs-treemap-vs-hashtable-vs-linkedhashmap/
			Map<Integer, String> map1 = new HashMap<Integer, String>();
			map1.put(1, "A");
			map1.put(2, "A");
			map1.put(3, "A");
			map1.put(4, "A");
			map1.put(5, "A");

			// LinkList and ArrayList
			/*
			 * Arraylist maintain indices like arrays. So if want more frequent get
			 * operations than put then arraylist is best to go.
			 * 
			 * LinkedList maintain pointers to elements. you can't to a specific
			 * index like in arraylist. But the advantage here in linkedlist is that
			 * they don't need to shift back and forth like in arraylist to maintain
			 * continues indices. So get operations in linkedlist are costly as you
			 * would have to go through pointers to reach your elements. But put
			 * operations are good as compared to arraylist. you just need to
			 * connect to pointers and that's it.
			 * http://javahungry.blogspot.com/2015/04/difference-between-arraylist-and-linkedlist-in-java-example.html
			 */
			List<String> al = new ArrayList<String>();// creat arraylist
			al.add("Ravi");// adding object in arraylist
			al.add("Vijay");
			al.add("Ravi");
			al.add("Ajay");

			List<String> al2 = new LinkedList<String>();// creat linkedlist
			al2.add("James");// adding object in linkedlist
			al2.add("Serena");
			al2.add("Swati");
			al2.add("Junaid");

			System.out.println("arraylist: " + al);
			System.out.println("linkedlist: " + al2);
		}
}
