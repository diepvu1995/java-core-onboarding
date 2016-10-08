package onboarding.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortMap {
	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		
		testMap(treeMap);
	}
	
	public static void testMap(Map<Integer, String> map) {
		map.put(9, "night");
		map.put(5, "five");
		map.put(7, "seven");
		map.put(3, "three");
		map.put(2, "tow");
		map.put(8, "eight");
		map.put(0, "zero");
		map.put(4, "for");
		
		for(Integer key: map.keySet()){
			String value = map.get(key);
			System.out.println(key + ":" + value);
		}
	}
}
