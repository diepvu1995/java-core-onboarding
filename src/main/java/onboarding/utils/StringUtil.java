package onboarding.utils;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

//@Component
public class StringUtil implements IStringUtil {
	/*
	 * (non-Javadoc)
	 * 
	 * @see onboarding.java.IStringUtil#findSubString(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public int findSubString(String parentStr, String subStr) {
		return parentStr.lastIndexOf(subStr);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see onboarding.java.IStringUtil#findSubString(java.lang.String,
	 * java.lang.String, boolean)
	 */
	@Override
	public int findSubString(String parentStr, String subStr,
			boolean isSensitive) {
		return isSensitive ? parentStr.lastIndexOf(subStr) : parentStr
				.toLowerCase().lastIndexOf(subStr.toLowerCase());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see onboarding.java.IStringUtil#removeCharAt(java.lang.String, int)
	 */
	@Override
	public String removeCharAt(String parentStr, int index) {
		return new StringBuilder(parentStr).deleteCharAt(index).toString();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see onboarding.java.IStringUtil#removeChar(java.lang.String, char)
	 */
	@Override
	public String removeChar(String parentStr, char removeChar) {
		return parentStr.replaceAll(parentStr, String.valueOf(removeChar));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see onboarding.java.IStringUtil#upper(java.lang.String)
	 */
	@Override
	public String upper(String originalStr) {
		return originalStr.toUpperCase();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see onboarding.java.IStringUtil#lower(java.lang.String)
	 */
	@Override
	public String lower(String originalStr) {
		return originalStr.toLowerCase();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see onboarding.java.IStringUtil#transform(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public String transform(String originalStr, String targetCase) {
		return targetCase.equals("UP") ? originalStr.toUpperCase()
				: originalStr.toLowerCase();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see onboarding.java.IStringUtil#reverse(java.lang.String)
	 */
	@Override
	public String reverse(String originalStr) {
		return (new StringBuffer(originalStr)).reverse().toString();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see onboarding.java.IStringUtil#split(java.lang.String, char)
	 */
	@Override
	public String[] split(String originalStr, char delimeter) {
		return originalStr.split(String.valueOf(delimeter));
	}

	/**
	 * Given a map of food keys and their topping values, modify and return the
	 * map as follows: if the key "ice cream" has a value, set that as the value
	 * for the key "yogurt" also. If the key "spinach" has a value, change that
	 * value to "nuts"
	 * 
	 * @param map
	 * @return
	 */
	public Map<String, String> topping2(Map<String, String> map) {
		if (map.containsValue("spinach")) {
			map.put("spinach", "nuts");
		}
		if (map.containsKey("ice cream")) {
			map.put("yogurt", map.get("ice cream"));
		}
		return map;
	}

	/**
	 * word cout in a String[]
	 * 
	 * @param strings
	 * @return
	 */
	public Map<String, Integer> wordCount(String[] strings) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < strings.length; i++) {
			String test = strings[i];
			if (map.containsKey(test)) {
				int count = map.get(test);
				map.put(test, count + 1);
			} else {
				map.put(test, 1);
			}
		}
		return map;
	}

	/**
	 * cout occurence of a item in string java
	 * 
	 * @param strings
	 * @return "aabcddefdaa"->"a2bcd2edda2"
	 */
	public String zipText(String s) {
		String newString = "";
		// convert 1 chuoi ve mot mang ki tu
		char[] a = s.toCharArray();
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0;; j++) {
				if ((a[i + j] != a[i + j + 1] && i + j + 1 < a.length)) {
					newString += String.valueOf(a[i]);
					i = i + j;
					if (j != 0) {
						newString += String.valueOf(j + 1);
						if (i + 2 == a.length) {
							newString += String.valueOf(a[i + 1])
									+ String.valueOf(1);
						}
					} else {
						newString += String.valueOf(1);
					}
					break;
				} else if ((a[i + j] == a[i + j + 1] && i + j + 1 >= a.length - 1)) {
					newString += String.valueOf(a[i]) + String.valueOf(j + 2);
					i = i + j;
					break;
				}
			}
		}

		return newString;
	}

	/**
	 * EX: convert "a2bcd2edda2"->"aabcddefdaa"
	 * 
	 * @param strings
	 * @return
	 */
	public boolean isNumberic(char c) {
		if (!Character.isDigit(c)) {
			return false;
		}
		return true;
	}

	/**
	 * 
	 * @param c
	 * @param num
	 * @return
	 */
	public String returnString(char c, int num) {
		String s = "";
		for (int i = 0; i < num; i++) {
			s += c;
		}
		return s;
	}

	public String unzipText(String strings) {
		String result = "";
		char[] s = strings.toCharArray();
		for (int i = 0; i <= s.length - 1; i++) {
			if (isNumberic(s[i])) {
				result += returnString(s[i - 1],
						Integer.valueOf(String.valueOf(s[i])));
			} else {
				if (i == s.length - 1) {
					result += s[i];
				}
				continue;
			}
		}
		return result;
	}

	/**
	 * hello everyone => h: 1 e: 4 l: 2 o: 2 v: 1 r: 1 y: 1 n: 1 hllo vryon
	 * 
	 * @param inputString
	 * @return
	 */
	public String removeDuplicate(String inputString) {
		inputString = inputString.replaceAll(" ", "");
		char[] c = inputString.toCharArray();
		Map<String, Integer> newString = new LinkedHashMap<String, Integer>();
		int count = 0;
		for (int i = 0; i <= c.length - 1; i++) {
			count = countCharacter(c, c[i]);
			newString.put(String.valueOf(c[i]), count);
		}
		Set<Entry<String, Integer>> entrySet = newString.entrySet();
		entrySet.stream().forEach(
				i -> System.out.println(i.getKey() + ":" + i.getValue()));
		List<Entry<String, Integer>> filterKey = entrySet.stream()
				.filter(e -> e.getValue() > 3).collect(Collectors.toList());
		for (int i = 0; i < filterKey.size(); i++) {
			inputString = inputString.replaceAll(filterKey.get(i).getKey(), "");

		}
		return inputString;
	}

	private int countCharacter(char[] c, char character) {
		int count = 0;
		for (int j = 0; j <= c.length - 1; j++) {
			if (c[j] == character) {
				count++;
			}
		}
		return count;
	}

	public int maxBlock(String str) {
		int maxBlock = 1;
		int counter = 1;
		if (str.isEmpty()) {
			return 0;
		}
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i - 1) == str.charAt(i)) {
				if (++counter > maxBlock) {
					maxBlock = counter;
				}
			} else {
				counter = 1;
			}
		}

		return maxBlock;
	}

	public int sumDigits(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				sum += Integer.parseInt(str.substring(i, i + 1));
			}
		}
		return sum;
	}

	public String mirrorEnds(String string) {
		String result = "";
		int length = string.length();
		for (int i = 0, j = length - 1; i < length; i++, j--) {
			if (string.charAt(i) == string.charAt(j)) {
				result += string.charAt(i);
			} else {
				break;
			}
		}
		return result;
	}

	/**
	 * Given a positive integer n, output the string representation
	 * 
	 * of all the numbers from 1 to n inclusive while replacing
	 * 
	 * multiples of 5 with Code, multiples of 7 with Fight and
	 * 
	 * multiples of both 5 and 7 with CodeFight.
	 */

	public String[] CodeFight(int n) {
		String[] s = new String[n];
		for (int i = 1; i <= n; i++) {
			s[i - 1] = i + "";
			if (i % 35 == 0)
				s[i - 1] = "CodeFight";
			else if (i % 5 == 0)
				s[i - 1] = "Code";
			else if (i % 7 == 0)
				s[i - 1] = "Fight";
		}
		return s;

	}

	public String longestWord(String s) {
		if (" ".equals(s)) {
			return " ";
		}
		String word = "";
		String longestWord = "";
		int lw, max = 0;
		for (int i = 0; i < s.length(); i++) {
			if (!Character.isWhitespace(s.charAt(i))) {
				if (Character.isAlphabetic(s.charAt(i))) {
					word = word + s.charAt(i);
				}
			}
			if ((i == s.length() - 1) || Character.isWhitespace(s.charAt(i))) {
				lw = word.length();
				if (lw > max) {
					max = lw;
					longestWord = word;
				}
				word = "";
			}
		}
		return longestWord;
	}

	public String iqAddress(int n) {
		String result = "";
		while (n > 1) {
			result = (n % 10.5) + result;
			n = (n + 1) / 2;
		}
		return "1" + result;
	}
}
