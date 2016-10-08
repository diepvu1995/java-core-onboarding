package onboarding.collection;

import java.util.Map;

public class HashMap {
	public static void main(String[] args) {
		java.util.HashMap<Integer, String> map = new java.util.HashMap<Integer, String>();
		map.put(5, "Five");
		map.put(8, "Eight");
		map.put(6, "Six");
		map.put(4, "Four");
		map.put(2, "Tow");

		// map.put(6, "Say Hello");

		String text = map.get(6);

		System.out.println(text);

		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + ":" + value);// 2 4 5 6 8
		}

	}

}
