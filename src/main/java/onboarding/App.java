package onboarding;

import onboarding.java.StringUtil;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		StringUtil stringUtil = new StringUtil();
		System.out.println("=====findSubString=====");
		System.out.println(stringUtil.findSubString(
				"Hello world ,Hello Reader", "Hello"));
		System.out.println("=====Upper=====");
		System.out.println(StringUtil.upper("this-is-Java"));
		System.out.println("=====Lower=====");
		System.out.println(StringUtil.lower("this-is-Java"));
		System.out.println("=====Transform=====");
		System.out.println(StringUtil.transform("Hello world ,Hello Reader",
				"UP"));
		System.out.println("=====FindSubString with case-sensitive======");
		System.out.println(StringUtil.findSubString(
				"Hello world ,hello Reader", "hello", false));
		System.out.println("=====removeChatAt=====");
		System.out.println(StringUtil.removeCharAt("this is java", 3));
		System.out.println("=====removeChar=====");
		System.out.println(StringUtil.removeChar("Hello", 'e'));
		System.out.println("=====reverse=====");
		System.out.println(StringUtil.reverse("this is java"));
		System.out.println("=====Split====");
		String[] split = StringUtil.split("this-is-Java", 's');
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}
	}
}
