package onboarding.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class CollectionUtils {
	/**
	 * sap xep mang giam dan
	 * 
	 * @param array
	 * @return a array desending
	 */
	public static List<Integer> sortByDesc(List<Integer> array) {
		List<Integer> sortedArray = new ArrayList<Integer>(array);
		// anonymous class, why have new in interface, and have funtion
		sortedArray.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// desc: O2 - O1, asc = O1 -O2;
				return o2.intValue() - o1.intValue();
			}
		});
		return sortedArray;
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
		sortedArray.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1.intValue() - o2.intValue();
			}
		});
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
	 * sap xep mang theo dieu kien
	 * 
	 * @param array
	 * @param isAsc
	 * @return
	 */
	public static List<Integer> sort(List<Integer> array, boolean isAsc) {
		List<Integer> sortArray = new ArrayList<Integer>(array);
		return isAsc ? sortByAsc(sortArray) : sortByDesc(sortArray);
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
		return array.contains(findingValue);
	}

	/**
	 * tim vi tri cua gia tri nhap vao
	 * 
	 * @param array
	 * @param findingValue
	 * @return
	 */
	public static int findIndex(List<Integer> array, int findingValue) {
		return array.indexOf(findingValue);
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
		List<Integer> removeArray = new ArrayList<Integer>(array);
		// chuyen removedValue vao trong mot List
		removeArray.removeAll(Arrays.asList(removedValue));
		return removeArray;
	}

	/**
	 * Remove one element into one array by index
	 * 
	 * @param array
	 * @param removedIndex
	 * @return
	 */
	public static List<Integer> removeByIndex(List<Integer> array,
			int removedIndex) {
		List<Integer> reIndexArray = new ArrayList<Integer>(array);
		// remove a element at a position
		reIndexArray.remove(removedIndex);
		return reIndexArray;
	}

	/**
	 * Remove one sub array element from one parent array
	 * 
	 * @param array
	 * @param removeArray
	 * @return
	 */
	public static List<Integer> removeBySubArray(List<Integer> array,
			List<Integer> removeArray) {
		List<Integer> resubAray = new ArrayList<Integer>(array);
		resubAray.removeAll(removeArray);
		return resubAray;
	}

	/**
	 * check 6 in first or last
	 * 
	 * @param nums
	 * @return
	 */
	public static boolean find6(List<Integer> nums) {
		List<Integer> findArray = new ArrayList<Integer>(nums);
		// findArray.stream().filter(e -> e.intValue() == 6).findFirst().get();
		// tim vi tri lan suat hien dau tien cua doi tuong 6.
		int posOf6 = findArray.indexOf(new Integer(6));
		return (posOf6 == 0 || posOf6 == findArray.size() - 1) ? true : false;
	}

	/**
	 * check first or last element of a[] and b[]
	 * 
	 * @param a
	 * @param b
	 * @return true if =, false if #
	 */
	public static boolean commonEnd(List<Integer> a, List<Integer> b) {
		// neu phan tu dau hoac phan tu coi cua 2 mang bang nhau -> return true
		return (a.get(0) == b.get(0) || a.get(a.size() - 1) == b
				.get(b.size() - 1)) ? true : false;
	}

	/**
	 * check element 2 and 3 in nums[]
	 * 
	 * @param nums
	 * @return true if no 2,3, false if have 2,3
	 */
	public static boolean no23(List<Integer> nums) {
		// indexOf return 1 if hava element, and -1 if no have
		return (nums.indexOf(new Integer(2)) > 0 || nums
				.indexOf(new Integer(3)) > 0) ? false : true;

	}

	/**
	 * make a subArray contain two element in midle parentArray
	 * 
	 * @param nums
	 * @return
	 */
	public static List<Integer> makeMidle(List<Integer> nums) {
		List<Integer> middleArray = new ArrayList<Integer>(nums);
		int size = middleArray.size();
		if (size % 2 == 0) {
			middleArray.subList(size / 2, (size / 2) + 1);
		}
		return middleArray;
	}

	public static boolean unlucky1(List<Integer> nums) {
		return (nums.indexOf(new Integer(1)) > 1) ? false : true;
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
		for (int i : maxArray) {
			// thay the tat ca gia tri cua mang maxArray bang value
			Collections.replaceAll(maxArray, i, value);
		}
		return maxArray;
	}

	/**
	 * Add two arrayList to one ArrayList
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static List<Integer> plusTwo(List<Integer> a, List<Integer> b) {
		List<Integer> plusArray = new ArrayList<Integer>();
		plusArray.addAll(a);
		plusArray.addAll(b);
		return plusArray;
	}

	/**
	 * rotateLeft a arrayList
	 * 
	 * @param nums
	 * @return
	 */
	public static List<Integer> rotateLeft3(List<Integer> nums) {
		List<Integer> rotateArray = new ArrayList<Integer>(nums);
		Collections.rotate(rotateArray, -1);
		return rotateArray;
	}

	public static int sum(List<Integer> nums) {
		int sum = 0;
		for (int i = 0; i < nums.size(); i++) {
			sum += nums.get(i);
		}
		return sum;
	}

	public static List<Integer> biggerTwo(List<Integer> a, List<Integer> b) {
		return (sum(a) > sum(b)) ? a : b;
	}

	public static List<Integer> swapEnds(List<Integer> nums) {
		Collections.swap(nums, 0, nums.size() - 1);
		return nums;
	}

	public static List<Integer> zeroMax(List<Integer> nums) {
		int temp = 0;
		for (int i = 0; i < nums.size(); i++) {
			if (nums.get(i) == 0) {
				for (int j = i; j < nums.size(); j++) {
					if (nums.get(j) % 2 != 0 && nums.get(j) > temp) {
						temp = nums.get(j);
					}
				}
				// nums.get(i) = temp;
				temp = 0;
			}
		}
		return nums;
	}

	public boolean twoTwo(List<Integer> nums) {
		// duyet tu dau den cuoi mang
		for (int i = 0; i < nums.size(); i++) {
			// if num[i]=2
			if (nums.get(i) == 2) {
				// tang bien i de kiem tra so tiep theo co la 2 hay khong
				i++;
				// neu la vi tri cuoi cung, va khac 2 thi return false
				if (!(i < (nums.size())) || nums.get(i) != 2)
					return false;
				// tiep tuc su dung vong lap while de kiem tra cac so tiep theo
				while (i < nums.size() && nums.get(i) == 2)
					i++;
			}
		}
		return true;
	}

	public static int median(List<Integer> nums) {
		return (nums.size() % 2 == 0) ? (nums.get((nums.size() / 2) - 1) + nums
				.get(nums.size() / 2)) / 2 : nums.get(nums.size() - 1) / 2;
	}

	public boolean tripleUp(List<Integer> a) {
		if (a.size() > 3) {
			for (int i = 0; i < a.size() - 2; i++) {
				if (a.get(i + 1) - a.get(i) == 1
						&& a.get(i + 2) - a.get(i + 1) == 1) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean more14(List<Integer> nums) {
		int dem1 = 0;
		int dem4 = 0;
		for (int i = 0; i < nums.size(); i++) {
			if (nums.get(i) == 1) {
				dem1++;
			}
			if (nums.get(i) == 4) {
				dem4++;
			}
		}
		return (dem1 > dem4) ? true : false;
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
	public static Map<String, String> topping2(Map<String, String> map) {
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
	public static Map<String, Integer> wordCount(String[] strings) {
		Map<String, Integer> map = new HashMap();
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
	public static String zipText(String s) {
		String newString = "";
		char[] a = s.toCharArray();
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0;; j++) {
				if (a[i + j] != a[i + j + 1] && j == 0 && i + j + 1 < a.length) {
					newString += String.valueOf(a[i]);
					i = i + j;
					break;
				} else if ((a[i + j] != a[i + j + 1] && j >= 1)) {
					newString += String.valueOf(a[i]) + String.valueOf(j + 1);
					i = i + j;
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
	public static String unzipText(String strings) {
		return strings;
	}

}
