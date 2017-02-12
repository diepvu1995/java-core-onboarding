package onboarding.utils;

import java.util.Map;

public interface IStringUtil {

	/**
	 * find the last postion of sub-string
	 * 
	 * @param parentStr
	 * @param subStr
	 * @return postion of string
	 */
	int findSubString(String parentStr, String subStr);

	/**
	 * Find postion with case-sensitive flag
	 * 
	 * @param parentStr
	 * @param subStr
	 * @param isSensitive
	 * @return vi tri cua subStr trong parent
	 */
	int findSubString(String parentStr, String subStr, boolean isSensitive);

	/**
	 * remove a character from parent string.
	 * 
	 * @param parentStr
	 * @param index
	 *            }
	 * @return a newString after remove oldString in index
	 */
	String removeCharAt(String parentStr, int index);

	/**
	 * Remove a character
	 * 
	 * @param parentStr
	 * @param removeChar
	 * @return a newString after remove oldString with character
	 */
	String removeChar(String parentStr, char removeChar);

	/**
	 * Transform one string into upper case.
	 * 
	 * @param originalStr
	 * @return a string upper
	 */
	String upper(String originalStr);

	/**
	 * Transform one string into Lower case
	 * 
	 * @param originalStr
	 * @return a string Lower
	 */
	String lower(String originalStr);

	/**
	 * Transform one string into upper case or lower case
	 * 
	 * @param originalStr
	 * @param targetCase
	 * @return a string transform upper->Lower if "LO", lower->upper if "UP
	 */
	String transform(String originalStr, String targetCase);

	/**
	 * Reverse a String
	 * 
	 * @param originalStr
	 * @return a String is reversed
	 */
	String reverse(String originalStr);

	/**
	 * Split the parent string into sub-string by delimeter
	 * 
	 * @param originalStr
	 * @param delimeter
	 * @return a String[] after split
	 */
	String[] split(String originalStr, char delimeter);

	/**
	 * Given a map of food keys and their topping values, modify and return the
	 * map as follows: if the key "ice cream" has a value, set that as the value
	 * for the key "yogurt" also. If the key "spinach" has a value, change that
	 * value to "nuts"
	 * 
	 * @param map
	 * @return
	 */
	Map<String, String> topping2(Map<String, String> map);

	/**
	 * word cout in a String[]
	 * 
	 * @param strings
	 * @return
	 */
	Map<String, Integer> wordCount(String[] strings);

	/**
	 * cout occurence of a item in string java
	 * 
	 * @param strings
	 * @return "aabcddefdaa"->"a2bcd2edda2"
	 */
	String zipText(String s);

	/**
	 * EX: convert "a2bcd2edda2"->"aabcddefdaa"
	 * 
	 * @param strings
	 * @return
	 */
	boolean isNumberic(char c);

	/**
	 * 
	 * @param c
	 * @param num
	 * @return
	 */
	String returnString(char c, int num);

	String unzipText(String strings);

	/**
	 * hello everyone => h: 1 e: 4 l: 2 o: 2 v: 1 r: 1 y: 1 n: 1 hllo vryon
	 * 
	 * @param strings
	 * @return
	 */
	String removeDuplicate(String strings);

	int maxBlock(String str);

	int sumDigits(String str);

	String mirrorEnds(String string);

	String[] CodeFight(int n);

	String longestWord(String s);

	String iqAddress(int n);

}