package onboarding.java;

public class StringUtil {

	public int findSubString(String parentStr, String subStr) {
		return parentStr.lastIndexOf(subStr);
	}

	/**
	 * find with case-sensitive flag: phan biet hoa thuong
	 * 
	 * @param args
	 */
	public static int findSubString(String parentStr, String subStr,
			boolean isSensitive) {
		// isSensitive = false, khong phan biet hoa thuong, tim vi tri binh
		// thuong
		// true: chuyen 2 chuoi ve hoa hoac ve Chu thuong, roi di tim vi tri

		// TODO line 22 => if(isSensitive)
		if (isSensitive == true) {
			return parentStr.lastIndexOf(subStr);
		} else {
			// TODO viet 3 line 26->28 thanh 1 line
			String a = parentStr.toLowerCase();
			String b = subStr.toLowerCase();
			return a.lastIndexOf(b);
		}

	}

	public static StringBuilder removeCharAt(String parentStr, int index) {
		StringBuilder subStr = new StringBuilder(parentStr);
		subStr.deleteCharAt(index);
		return subStr;

	}

	public static String removeChar(String parentStr, char removeChar) {
		// TODO dung ham replace() cua String class
		String r = "";
		for (int i = 0; i < parentStr.length(); i++) {
			if (parentStr.charAt(i) != removeChar)
				r += parentStr.charAt(i);
		}
		return r;
	}

	public static String upper(String originalStr) {
		return originalStr.toUpperCase();
	}

	public static String lower(String originalStr) {
		return originalStr.toLowerCase();
	}

	public static String transform(String originalStr, String targetCase) {
		// TODO 1. su dung switch case o day la khong hop ly
		// TODO 2. su dung solution chi can 1 line of code
		switch (targetCase) {
		case "UP":
			return originalStr.toUpperCase();
		case "LO":
			return originalStr.toLowerCase();
		default:
			System.out.println("");
		}
		return originalStr;

	}

	public static String reverse(String originalStr) {
		// TODO tai sao phai khai bao bien [string] o day?
		String string = originalStr;
		String newOriginalStr = new StringBuffer(string).reverse().toString();
		return newOriginalStr;
	}

	/**
	 * Split the parent string into sub-string by delimeter
	 * 
	 * @param originalStr
	 * @param delimeter
	 * @return
	 */
	public static String[] split(String originalStr, char delimeter) {
		if (originalStr.contains(delimeter)) {
			String[] parts = originalStr.split(delimeter);
			return parts;
		} else {
			throw new IllegalArgumentException("chuoi " + originalStr
					+ " khong co -");
		}
	}
}
