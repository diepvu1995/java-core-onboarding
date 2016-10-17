package onboarding.java;

public class StringUtil {
	/**
	 * find the last postion of sub-string
	 * 
	 * @param parentStr
	 * @param subStr
	 * @return postion of string
	 */
	public int findSubString(String parentStr, String subStr) {
		return parentStr.lastIndexOf(subStr);
	}

	/**
	 * Find postion with case-sensitive flag
	 * 
	 * @param parentStr
	 * @param subStr
	 * @param isSensitive
	 * @return vi tri cua subStr trong parent
	 */
	public static int findSubString(String parentStr, String subStr,
			boolean isSensitive) {
		return isSensitive ? parentStr.lastIndexOf(subStr) : parentStr
				.toLowerCase().lastIndexOf(subStr.toLowerCase());
	}

	/**
	 * remove a character from parent string.
	 * 
	 * @param parentStr
	 * @param index
	 *            }
	 * @return a newString after remove oldString in index
	 */
	public static String removeCharAt(String parentStr, int index) {
		// StringBuilder subStr = new StringBuilder(parentStr);
		// return subStr.deleteCharAt(index).toString();
		return new StringBuilder(parentStr).deleteCharAt(index).toString();
	}

	/**
	 * Remove a character
	 * 
	 * @param parentStr
	 * @param removeChar
	 * @return a newString after remove oldString with character
	 */
	public static String removeChar(String parentStr, char removeChar) {
		return parentStr.replaceAll(parentStr, String.valueOf(removeChar));
	}

	/**
	 * Transform one string into upper case.
	 * 
	 * @param originalStr
	 * @return a string upper
	 */
	public static String upper(String originalStr) {
		return originalStr.toUpperCase();
	}

	/**
	 * Transform one string into Lower case
	 * 
	 * @param originalStr
	 * @return a string Lower
	 */
	public static String lower(String originalStr) {
		return originalStr.toLowerCase();
	}

	/**
	 * Transform one string into upper case or lower case
	 * 
	 * @param originalStr
	 * @param targetCase
	 * @return a string transform upper->Lower if "LO", lower->upper if "UP
	 */
	public static String transform(String originalStr, String targetCase) {
		return targetCase.equals("UP") ? originalStr.toUpperCase()
				: originalStr.toLowerCase();
	}

	/**
	 * Reverse a String
	 * 
	 * @param originalStr
	 * @return a String is reversed
	 */
	public static String reverse(String originalStr) {
		return (new StringBuffer(originalStr)).reverse().toString();
	}

	/**
	 * Split the parent string into sub-string by delimeter
	 * 
	 * @param originalStr
	 * @param delimeter
	 * @return a String[] after split
	 */
	public static String[] split(String originalStr, char delimeter) {
		return originalStr.split(String.valueOf(delimeter));
	}
}
