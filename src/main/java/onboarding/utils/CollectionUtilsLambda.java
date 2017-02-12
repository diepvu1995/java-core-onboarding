package onboarding.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectionUtilsLambda {
	/**
	 * sap xep mang giam dan
	 * 
	 * @param array
	 * @return a array desending
	 */
	public static List<Integer> sortByDesc(List<Integer> array) {
		List<Integer> sortedArray1 = new ArrayList<Integer>(array);
		List<Integer> sortedArray2 = new ArrayList<Integer>(array);
		List<Integer> sortedArray3 = new ArrayList<Integer>(array);
		// 1st way
		MyComparator mc = new MyComparator();
		sortedArray1.sort(mc);
		// 2nd way: using anonymous class, why have new in interface, and have
		// funtion
		sortedArray2.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// desc: O2 - O1, asc = O1 -O2;
				return o2.intValue() - o1.intValue();
			}
		});
		// 3rd way: lambda style
		sortedArray3.stream().sorted((i1, i2) -> i2.intValue() - i1.intValue());
		return sortedArray1;
	}

	/**
	 * SAP XEP TANG DAN
	 * 
	 * @param array
	 * @return
	 * 
	 */
	public static List<Integer> sortByAsc(List<Integer> array) {
		// khoi tao mang moi , copy lai mang array
		List<Integer> sortedArray = new ArrayList<Integer>(array);
		// TODO
		sortedArray.stream().sorted();
		return sortedArray;
	}

	/**
	 * dao nguoc mot mang
	 * 
	 * @param array
	 * @return a array is reversed
	 */
	public static List<Integer> reverse(List<Integer> array) {
		// khoi mot mang moi co do dai bang mang cu
		List<Integer> reverseArray = new ArrayList<Integer>(array);
		Collections.reverse(reverseArray);
		return reverseArray;
	}

	/**
	 * tim vi tri trong mang
	 * 
	 * @param array
	 * @param findingValue
	 * @return
	 */
	public static boolean find(List<Integer> array, int findingValue) {
		// tra ve tru neu array chua findingValue
		return array.stream().filter(e -> e == findingValue).count() > 0;
	}

	/**
	 * tim vi tri cua gia tri nhap vao
	 * 
	 * @param array
	 * @param findingValue
	 * @return
	 */
	public static int findIndex(List<Integer> array, int findingValue) {
		int[] indexes = IntStream.range(0, array.size())
				.filter(index -> array.get(index).intValue() == findingValue)
				.toArray();
		return indexes[0];
	}

	/**
	 * Them mot gia tri moi, vao vi tri moi trong mang.
	 * 
	 * @param array
	 * @param newValue
	 * @param newPosition
	 * @return newArray , add newValue in newPosition
	 */
	public static List<Integer> addElement(List<Integer> array, int newValue,
			int newPosition) {
		List<Integer> addArray = new ArrayList<Integer>(array);
		addArray.add(newPosition, newValue);
		return addArray;
	}

	/**
	 * Remove one element into one array by value
	 * 
	 * @param array
	 * @param removedValue
	 * @return
	 */
	public static List<Integer> removeByValue(List<Integer> array,
			int removedValue) {
		// collect(Collector.toList) tra ve mot list
		List<Integer> removeArray = array.stream()
				.filter(e -> e.intValue() != removedValue)
				.collect(Collectors.toList());
		return removeArray;
	}

	/**
	 * Calculate the sum of input integers.
	 * 
	 * @param nums
	 * @return int
	 */
	public static int sum(List<Integer> nums) {
		return nums.stream().mapToInt(element -> element).sum();
	}

	/**
	 * check 6 in first or last
	 * 
	 * @param nums
	 * @return
	 */
	public static boolean find6(List<Integer> nums) {
		return IntStream
				.range(0, nums.size())
				.filter(index -> (nums.get(index).intValue() == 6)
						&& (index == 0 || index == nums.size() - 1)).count() > 0;
	}

	/**
	 * check element 2 and 3 in nums[]
	 * 
	 * @param nums
	 * @return true if no 2,3, false if have 2,3
	 */
	public static boolean no23(List<Integer> nums) {
		return (IntStream
				.range(0, nums.size())
				.filter(index -> (nums.get(index).intValue() == 2 || nums.get(
						index).intValue() == 3)).count() > 0) ? false : true;
	}

	/**
	 * replace all element of a ArrayList ( compare first element with last
	 * element)
	 * 
	 * @param nums
	 * @return
	 */
	public static List<Integer> maxEnd(List<Integer> nums) {
		List<Integer> maxArray = new ArrayList<Integer>(nums);
		int value = (maxArray.get(0) >= maxArray.get(maxArray.size() - 1)) ? maxArray
				.get(0) : maxArray.get(maxArray.size() - 1);
		return maxArray.stream().map(v -> value).collect(Collectors.toList());
	}

	public static boolean more14(List<Integer> nums) {
		int dem1 = (int) nums.stream().filter(v -> v.intValue() == 1).count();
		int dem4 = (int) nums.stream().filter(v -> v.intValue() == 4).count();
		return (dem1 > dem4) ? true : false;
	}

	@SuppressWarnings("unchecked")
	public static List<Album> album(List<Album> albums) {
		List<Album> newAlbum = albums
				.stream()
				.filter(a -> a.track.stream().filter(t -> t.rating >= 4)
						.count() > 0).collect(Collectors.toList());
		return newAlbum.stream().sorted((a1, a2) -> a1.name.compareTo(a2.name))
				.collect(Collectors.toList());
	}

	public class Track {
		public int rating;
	}

	public class Album {
		public List<Track> track;
		public String name;
	}

	public static int countClumps(List<Integer> nums) {
		return 0;

	}
}

class MyComparator implements Comparator<Integer> {
	@Override
	public int compare(Integer o1, Integer o2) {
		// desc: O2 - O1, asc = O1 -O2;
		return o2.intValue() - o1.intValue();
	}
}
