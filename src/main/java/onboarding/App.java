package onboarding;

import onboarding.java.ArrayUtil;
import onboarding.java.StringUtil;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		StringUtil stringUtil = new StringUtil();
		System.out.println("=====findsubstring=====");
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
		System.out.println("=====SORT ARRAY DESCENDING======");
		ArrayUtil arrayUtil = new ArrayUtil();
		int[] array = { 3, 4, 2, 1, 0, 9, 5, 2 };
		int[] a1 = arrayUtil.sortByDesc(array);
		for (int i = 0; i < a1.length; i++) {
			System.out.println(a1[i]);
		}

		System.out.println("=====REVERSE ONE INTEGER ARRAY======");
		int[] a2 = arrayUtil.reverse(array);
		for (int i = 0; i < a2.length; i++) {
			System.out.println(a2[i]);
		}

		System.out.println("=====SORT ARRAY ASENCDING======");
		int[] a3 = arrayUtil.sortByAsc(array);
		for (int i = 0; i < a3.length; i++) {
			System.out.println(a3[i]);
		}
		System.out.println("==== SORT WITH FLAG======");
		int[] a4 = arrayUtil.sort(array, false);
		for (int i = 0; i < a4.length; i++) {
			System.out.println(a4[i]);
		}

		System.out.println("====FIND ONE ELEMENT IN ARRAY ======");
		boolean a5 = arrayUtil.find(array, 9);
		System.out.println(a5);

		System.out.println("====FIND THE INDEX OF ONE ELEMENT IN ARRAY======");
		int a6 = arrayUtil.findIndex(array, 4);
		System.out.println(a6);

		System.out.println("======ADD NEW ELEMENT INTO ONE ARRAY AT ONE SPECIFIC INEX======");
		int[] a7 = arrayUtil.addElement(array, 8, 0);
		for (int i = 0; i < a7.length; i++) {
			System.out.println(a7[i]);
		}
	}
}
