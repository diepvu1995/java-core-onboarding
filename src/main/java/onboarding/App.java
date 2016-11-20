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
		System.out.println("====FINDSUBSTRING=====");
		System.out.println(stringUtil.findSubString(
				"Hello world ,Hello Reader", "Hello"));
		System.out.println("");
		System.out.println("====UPPER=====");
		System.out.println(StringUtil.upper("this-is-Java"));
		System.out.println("");
		System.out.println("====LOWER=====");
		System.out.println(StringUtil.lower("this-is-Java"));
		System.out.println("");
		System.out.println("====TRANSFORM=====");
		System.out.println(StringUtil.transform("Hello world ,Hello Reader",
				"UP"));
		System.out.println("");
		System.out.println("====FINDSUBSTRING WITH CASE-SENSITIVE======");
		System.out.println(StringUtil.findSubString(
				"Hello world ,hello Reader", "hello", false));
		System.out.println("");
		System.out.println("====REMOVECHATAT=====");
		System.out.println(StringUtil.removeCharAt("this is java", 3));
		System.out.println("");
		System.out.println("====REMOVECHAR=====");
		System.out.println(StringUtil.removeChar("Hello", 'e'));
		System.out.println("");
		System.out.println("====REVERSE=====");
		System.out.println(StringUtil.reverse("this is java"));
		System.out.println("");
		System.out.println("====SPLIT====");
		String[] split = StringUtil.split("this-is-Java", 's');
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}
		System.out.println("");
		System.out
				.println("====================ARRAY Util======================");
		int[] array = { 3, 4, 2, 1, 0, 9, 5, 2 };

		System.out.println("====SORT ARRAY DESCENDING======");
		ArrayUtil arrayUtil = new ArrayUtil();
		int[] a1 = arrayUtil.sortByDesc(array);
		for (int i = 0; i < a1.length; i++) {
			System.out.print(a1[i] + " ");
		}

		System.out.println("");
		System.out.println("====REVERSE ONE INTEGER ARRAY======");
		int[] a2 = arrayUtil.reverse(array);
		for (int i = 0; i < a2.length; i++) {
			System.out.print(a2[i] + " ");
		}

		System.out.println("");
		System.out.println("====SORT ARRAY ASENCDING======");
		int[] a3 = arrayUtil.sortByAsc(array);
		for (int i = 0; i < a3.length; i++) {
			System.out.print(a3[i] + " ");
		}

		System.out.println("");
		System.out.println("====SORT WITH FLAG======");
		int[] a4 = arrayUtil.sort(array, false);
		for (int i = 0; i < a4.length; i++) {
			System.out.print(a4[i] + " ");
		}

		System.out.println("");
		System.out.println("====FIND ONE ELEMENT IN ARRAY ======");
		boolean a5 = arrayUtil.find(array, 9);
		System.out.println(a5);

		System.out.println("====FIND THE INDEX OF ONE ELEMENT IN ARRAY======");
		int a6 = arrayUtil.findIndex(array, 4);
		System.out.println(a6);

		System.out
				.println("====ADD NEW ELEMENT INTO ONE ARRAY AT ONE SPECIFIC INEX======");
		int[] a7 = arrayUtil.addElement(array, 8, 19);
		for (int i = 0; i < a7.length; i++) {
			System.out.print(a7[i] + " ");
		}

		System.out.println(" ");
		System.out.println("====REMOVE ONE ELEMENT INTO ONE ARRAY BY VALUE=");
		int[] a8 = arrayUtil.removeByValue(array, 4);
		for (int i = 0; i < a8.length; i++) {
			System.out.print(a8[i] + " ");
		}

		System.out.println("");
		System.out.println("====REMOVE ONE ELEMENT INTO ONE ARRAY BY INDEX==");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("");
		int[] a9 = arrayUtil.removeByIndex(array, 2);
		for (int i = 0; i < a9.length; i++) {
			System.out.print(a9[i] + " ");
		}

		System.out.println("");
		System.out
				.println("====REMOVE SUB ARRAY ELEMENT FROM ONE PARENT ARRAY==");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("");
		int[] array1 = { 4, 9 };
		int[] a10 = arrayUtil.removeBySubArray(array, array1);
		for (int i = 0; i < a10.length; i++) {
			System.out.print(a10[i] + " ");
		}

		System.out.println("");
		System.out.println("====Find6==");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("");
		System.out.println(arrayUtil.find6(array));

		System.out.println("");
		System.out.println("====COMMONEND==");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		int[] array2 = { 5, 8, 0 };
		System.out.println("");
		System.out.println(arrayUtil.commonEnd(array, array2));

		System.out.println("");
		System.out.println("====No23==");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("");
		System.out.println(arrayUtil.no23(array2));

		System.out.println("");
		System.out.println("====MAKEMIDLE==");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("");
		int[] array3 = { 4 };
		int[] a14 = arrayUtil.makeMidle(array3);
		for (int i = 0; i < a14.length; i++) {
			System.out.print(a14[i] + " ");
		}

		System.out.println("");
		System.out.println("====Unlucky1==");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("");
		System.out.println(arrayUtil.unlucky1(array));

		System.out.println("");
		System.out.println("====MAKEMIDLE==");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("");
		int[] a16 = arrayUtil.maxEnd(array);
		for (int i = 0; i < a16.length; i++) {
			System.out.print(a16[i] + " ");
		}

		System.out.println("");
		System.out.println("====plusTwo Array==");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("");
		int[] array6 = { 7, 8, 7 };
		int[] a17 = arrayUtil.plusTwo2(array, array6);
		for (int i = 0; i < a17.length; i++) {
			System.out.print(a17[i] + " ");
		}

		System.out.println("");
		System.out.println("====Rotate Left==");
		System.out.println("");
		int[] array7 = { 5, 11, 9, 7 };
		int[] a18 = arrayUtil.rotateLeft3(array7);
		for (int i = 0; i < a18.length; i++) {
			System.out.print(a18[i] + " ");
		}

		System.out.println("");
		System.out.println("====bigger Tow Array==");
		System.out.println("");
		int[] array8 = { 1, 1, 3 };
		int[] array9 = { 1, 2 };
		int[] a19 = arrayUtil.biggerTow(array8, array9);
		for (int i = 0; i < a19.length; i++) {
			System.out.print(a19[i] + " ");
		}

		System.out.println("");
		System.out.println("====Swap First End==");
		System.out.println("");
		System.out.println("====plusTwo Array==");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("");
		int[] a20 = arrayUtil.swapEnds(array);
		for (int i = 0; i < a20.length; i++) {
			System.out.print(a20[i] + " ");
		}

		System.out.println("");
		System.out.println("====ZeroMax odd Value==");
		System.out.println("");
		int[] array10 = { 0, 11, 0, 7 };
		int[] a21 = arrayUtil.zeroMax(array10);
		for (int i = 0; i < a21.length; i++) {
			System.out.print(a21[i] + " ");
		}

		System.out.println("");
		System.out.println("====twotwo==");
		System.out.println("");
		int[] ar = { 2, 2, 4, 2, 3, 4 };
		System.out.println(arrayUtil.twoTwo(ar));

		System.out.println("");
		System.out.println("====Median==");
		System.out.println("");
		System.out.println(arrayUtil.median(ar));

		System.out.println("");
		System.out.println("====More14==");
		System.out.println("");
		System.out.println(arrayUtil.more14(ar));

		System.out.println("");
		System.out.println("====tripleUp==");
		System.out.println("");
		System.out.println(arrayUtil.tripleUp(ar));

		System.out.println("");
		System.out.println("====sumArray==");
		System.out.println("");
		int[] sumArray1 = { 2, 2, 4, 2, 3, 4 };
		int[] sumArray2 = { 3, 4, 2, 3, 2 };
		int[] sum = arrayUtil.sumArray(sumArray1, sumArray2);
		for (int i = 0; i < sum.length; i++) {
			System.out.print(sum[i]);
		}

		System.out.println("");
		int[] arrayClumps = { 1, 1, 5, 6, 6, 3, 3, 2, 2, 4, 5, 6, 8, 8 };
		int count = arrayUtil.countClumps(arrayClumps);
		System.out.print(count);

	}
}
