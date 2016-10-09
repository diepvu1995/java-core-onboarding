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

		if (isSensitive == false) {
			return parentStr.lastIndexOf(subStr);
		} else {
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

	public static void main(String[] args) {
		StringUtil stringUtil = new StringUtil();
		int a = stringUtil.findSubString("Hello world ,Hello Reader", "Hello");
		System.out.println(a);

		String upper = StringUtil.upper("this-is-Java");
		System.out.println(upper);

		String lower = StringUtil.lower("this-is-Java");
		System.out.println(lower);
		String transform = StringUtil.transform("Hello world ,Hello Reader",
				"UP");
		System.out.println(transform);

		int position = StringUtil.findSubString("Hello world ,hello Reader",
				"Hello", false);
		System.out.println(position);

		StringBuilder stringBuilder = StringUtil
				.removeCharAt("this is java", 3);
		System.out.println(stringBuilder);

		String removeChar = StringUtil.removeChar("Hello", 'e');
		System.out.println(removeChar);

		String reverse = StringUtil.reverse("this is java");
		System.out.println(reverse);

		// String[] split = StringUtil.split("this-is-Java", '-');
	}
}
