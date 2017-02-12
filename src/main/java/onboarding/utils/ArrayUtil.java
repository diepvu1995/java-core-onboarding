package onboarding.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

public class ArrayUtil implements IArrayUtil {
	/**
	 * sap xep mang giam dan
	 * 
	 * @param array
	 * @return a array desending
	 */
	public int[] sortByDesc(int[] array) {
		// copy mang ban dau vao mot mang moi
		int[] a = copyArray(array);
		// duyet qua tung phan tu cua mang
		// so sanh phan tu thu i vs i+1, neu i < i+1 thi doi cho va luu vao mot
		// bien tam , i>i+1 khong doi cho va so sanh phan tu ke tiep
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j <= i; j++) {
				if (a[i] >= a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		// return mang sau khi duoc sap xep
		return a;
	}

	private static int[] copyArray(int[] array) {
		// tao ra mot mang moi
		int[] a = new int[array.length];
		// copy cac gia tri cua mang cu sang mang moi
		for (int i = 0; i < array.length; i++) {
			a[i] = array[i];
		}
		return a;
	}

	/**
	 * dao nguoc mot mang
	 * 
	 * @param array
	 * @return a array is reversed
	 */
	public int[] reverse(int[] array) {
		// tao ra mot mang moi co do dai bang mang cu
		int[] newArray = copyArray(array);
		// duyet tu phan cuoi cua mang cu
		int j = 0;
		for (int i = array.length - 1; i >= 0; i--) {
			// lay phan tu cuoi cua mang cu chen vao phan tu dau cua mang moi
			int temp = array[i];
			newArray[j] = temp;
			j++;
		}
		return newArray;
	}

	/**
	 * SAP XEP TANG DAN
	 * 
	 * @param array
	 * @return
	 */
	public int[] sortByAsc(int[] array) {
		int[] newArray = sortByDesc(array);
		return reverse(newArray);
	}

	/**
	 * sap xep mang theo dieu kien
	 * 
	 * @param array
	 * @param isAsc
	 * @return
	 */
	public int[] sort(int[] array, boolean isAsc) {
		int[] newArray = copyArray(array);
		return isAsc ? sortByAsc(newArray) : sortByDesc(newArray);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see xmlConfig.IArrayUtil#find(int[], int)
	 */
	@Override
	public boolean find(int[] array, int findingValue) {
		// duyet qua tat ca phan tu cua mang
		for (int i = 0; i < array.length; i++) {
			if (array[i] == findingValue) {
				return true;
			}
		}
		return false;

	}

	public int findIndex(int[] array, int findingValue) {
		// duyet qua tat ca phan tu cua mang
		// neu finding = a[i] -> vi tri, nguoc lai tra ve -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == findingValue) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * Them mot gia tri moi, vao vi tri moi trong mang.
	 * 
	 * @param array
	 * @param newValue
	 * @param newPosition
	 * @return newArray , add newValue in newPosition
	 */
	public int[] addElement(int[] array, int newValue, int newPosition) {
		// tao mot mang moi > mang cu 1 don vi de add a value
		int[] a = new int[array.length + 1];
		// copy cac gia tri cua mang cu sang mang moi
		for (int i = 0; i < array.length; i++) {
			a[i] = array[i];
		}
		// neu do dai mang moi >= newPosition -> add newValue
		if (a.length >= newPosition) {
			for (int i = a.length - 1; i > newPosition; i--) {
				int temp = a[i];
				a[i] = a[i - 1];
				a[i - 1] = temp;
			}
			a[newPosition] = newValue;
			// chuyen gia tri o vi tri cu nen vi tri moi 1 don vi,
			return a;
		}
		return array;
	}

	/**
	 * Remove one element into one array by value
	 * 
	 * @param array
	 * @param removedValue
	 * @return
	 */
	public int[] removeByValue(int[] array, int removedValue) {
		// tao ra mot mang moi de luu cac gia tri sau khi removeByValue
		int[] newArrays = new int[array.length - 1];
		// if cac gia tri trong mang cu Khac gia tri can remove -> add vo mang
		// moi
		int j = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != removedValue) {
				newArrays[j] = array[i];
				j++;
			}
		}
		return newArrays;
	}

	/**
	 * Remove one element into one array by index
	 * 
	 * @param array
	 * @param removedIndex
	 * @return
	 */
	public int[] removeByIndex(int[] array, int removedIndex) {
		if (removedIndex > array.length) {
			return array;
		}
		int[] a = new int[array.length - 1];
		int j = 0;
		for (int i = 0; i < array.length; i++) {
			// neu i khac vi tri remove thi chen array[i] vao mang moi a
			if (i != removedIndex) {
				a[j] = array[i];
				j++;
			}
		}
		return a;
	}

	/**
	 * Remove one sub array element from one parent array
	 * 
	 * @param array
	 * @param removeArray
	 * @return
	 */
	public int[] removeBySubArray(int[] array, int[] removeArray) {
		// copy tat ca gia tri array -> newArray
		int[] newArray = copyArray(array);
		// duyet tung gia tri trong mang removeArray
		for (int i = 0; i < removeArray.length; i++) {
			// kiem tra i co trong mang array?
			// neu co, lay vi tri trong mang array
			int a = findIndex(newArray, removeArray[i]);
			// goi ham removeByIndex de remove
			newArray = removeByIndex(newArray, a);
		}
		return newArray;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see xmlConfig.IArrayUtil#find6(int[])
	 */
	@Override
	public boolean find6(int[] nums) {
		// lay ra vi tri cua so 6 trong mang nums
		int a = findIndex(nums, 6);
		return (a == 0 || a == nums.length - 1) ? true : false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see xmlConfig.IArrayUtil#commonEnd(int[], int[])
	 */
	@Override
	public boolean commonEnd(int[] a, int[] b) {
		// neu phan tu dau hoac phan tu coi cua 2 mang bang nhau -> return true
		return (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]) ? true
				: false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see xmlConfig.IArrayUtil#no23(int[])
	 */
	@Override
	public boolean no23(int[] nums) {
		// duyet qua tung phan tu cua mang
		for (int i = 0; i < nums.length; i++) {
			// neu bang 2 hoac 3 -> return false
			if (nums[i] == 2 || nums[i] == 3) {
				return false;
			}
		}
		return true;
	}

	public int[] makeMidle(int[] nums) {
		// teo mot mang moi chua 2 phan tu
		int[] newArray = new int[2];
		// dem xem mang da cho do bao nhieu phan tu
		int dem = nums.length;
		if (dem % 2 == 0) {
			newArray[0] = nums[(nums.length / 2) - 1];
			newArray[1] = nums[nums.length / 2];
		} else {
			return new int[0];
		}
		return newArray;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see xmlConfig.IArrayUtil#unlucky1(int[])
	 */
	@Override
	public boolean unlucky1(int[] nums) {
		// duyet qua mang nums
		int dem = 0;
		for (int i = 0; i < nums.length; i++) {
			// dem so 1 co bao nhieu gia tri
			if (nums[i] == 1) {
				dem++;
			}
		}
		// neu gia tri dem=1->retuen true, nguoc lai return false
		return (dem == 1) ? true : false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see xmlConfig.IArrayUtil#maxEnd(int[])
	 */
	@Override
	public int[] maxEnd(int[] nums) {
		// tao mang moi newNums co do dai bang do dai int[] nums
		int[] newNums = new int[nums.length];
		// gan value = gia tri dau tien neu g.tri dau tien >= g.tri cuoi cung
		// nguoc lai gan value = gia tri cuoi cung
		int value = (nums[0] >= nums[nums.length - 1]) ? nums[0]
				: nums[nums.length - 1];
		// duyet qua mang moi, gan tat ca gia tri cho = value
		for (int i = 0; i < newNums.length; i++) {
			newNums[i] = value;
		}
		return newNums;
	}

	// TODO : DUNG 1 VONG LAP TRONG MANG C
	/*
	 * (non-Javadoc)
	 * 
	 * @see xmlConfig.IArrayUtil#plusTwo(int[], int[])
	 */
	@Override
	public int[] plusTwo(int[] a, int[] b) {
		// tao mang moi co do dai = tong do dai 2 mang a b
		int[] c = new int[a.length + b.length];
		// copy het gia tri mang a - > c
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		// copy b->c
		for (int i = 0; i < b.length; i++) {
			// copy tu phan tu tu vi tri = do dai cua mang a
			c[a.length + i] = b[i];
		}
		return c;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see xmlConfig.IArrayUtil#plusTwo2(int[], int[])
	 */
	@Override
	public int[] plusTwo2(int[] a, int[] b) {
		// tao mang moi co do dai = tong do dai 2 mang a b
		int[] c = new int[a.length + b.length];
		// copy het gia tri mang a - > c, b->c
		for (int i = 0; i < c.length; i++) {
			c[i] = (i < a.length) ? a[i] : b[i - a.length];
		}
		return c;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see xmlConfig.IArrayUtil#rotateLeft3(int[])
	 */
	@Override
	public int[] rotateLeft3(int[] nums) {
		int[] a = copyArray(nums);
		for (int i = 1; i < a.length; i++) {
			a[i] = nums[i - 1];
		}
		a[0] = nums[nums.length - 1];
		return a;
	}

	// ham tinh tong mot mang
	public int sum(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		return sum;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see xmlConfig.IArrayUtil#biggerTow(int[], int[])
	 */
	@Override
	public int[] biggerTow(int[] a, int[] b) {
		return (sum(a) > sum(b)) ? a : b;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see xmlConfig.IArrayUtil#swapEnds(int[])
	 */
	@Override
	public int[] swapEnds(int[] nums) {
		int[] a = copyArray(nums);
		int temp = a[0];
		a[0] = a[a.length - 1];
		a[a.length - 1] = temp;
		return a;
		// TODO khong dung bien tam, chi dung 2 gia tri a va b , hay doi cho a
		// va b
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see xmlConfig.IArrayUtil#zeroMax(int[])
	 */
	@Override
	public int[] zeroMax(int[] nums) {
		// tao mot mang moi, copy gia tri nums->newarray
		int[] a = copyArray(nums);
		for (int i = 0; i < a.length; i++) {
			// duyet mang moi, neu gia tri = 0->duyet tu vi tri 0 den cuoi
			// cua mang nums ->lay ra cac so le, duyet qua mang so le lay phan
			// tu lon nhat, la so le
			int oddValue = 0;
			if (a[i] == 0) {
				for (int j = i + 1; j < a.length; j++) {
					oddValue = oddValue(nums, i + 1);
				}
				a[i] = oddValue;
			}
		}
		return a;
	}

	/**
	 * tim phan tu le, lon nhat trong mang.
	 * 
	 * @param nums
	 * @return
	 */
	private static int oddValue(int[] nums, int begin) {
		// duyet qua mang, lay so se, -> chon ra so lon nhat trong cac so le
		int[] a = new int[nums.length];
		int j = 0;
		// xet tu vi tri begin
		int temp2 = a[begin];
		for (int i = begin; i < nums.length; i++) {
			if (nums[i] % 2 != 0 && nums[i] > temp2) {
				a[j] = nums[i];
				temp2 = a[j];
			}
		}
		return temp2;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see xmlConfig.IArrayUtil#twoTwo(int[])
	 */
	@Override
	public boolean twoTwo(int[] nums) {
		// duyet tu dau den cuoi mang
		for (int i = 0; i < nums.length; i++) {
			// if num[i]=2
			if (nums[i] == 2) {
				// tang bien i de kiem tra so tiep theo co la 2 hay khong
				i++;
				// neu la vi tri cuoi cung, va khac 2 thi return false
				if (!(i < (nums.length)) || nums[i] != 2)
					return false;
				// tiep tuc su dung vong lap while de kiem tra cac so tiep theo
				while (i < nums.length && nums[i] == 2)
					i++;
			}
		}
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see xmlConfig.IArrayUtil#median(int[])
	 */
	@Override
	public int median(int[] nums) {
		return (nums.length % 2 == 0) ? (nums[(nums.length / 2) - 1] + nums[nums.length / 2]) / 2
				: nums[(nums.length - 1) / 2];
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see xmlConfig.IArrayUtil#more14(int[])
	 */
	@Override
	public boolean more14(int[] nums) {
		// dem so luong phan tu 1
		// dem so luong phan tu 4
		int dem1 = 0;
		int dem4 = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				dem1++;
			}
			if (nums[i] == 4) {
				dem4++;
			}
		}
		return (dem1 > dem4) ? true : false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see xmlConfig.IArrayUtil#tripleUp(int[])
	 */
	@Override
	public boolean tripleUp(int[] a) {
		if (a.length > 3) {
			for (int i = 0; i < a.length - 2; i++) {
				if (a[i + 1] - a[i] == 1 && a[i + 2] - a[i + 1] == 1) {
					return true;
				}
			}
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see xmlConfig.IArrayUtil#sumArray(int[], int[])
	 */
	@Override
	public int[] sumArray(int[] a, int[] b) {
		int resultLength = (a.length > b.length) ? a.length : b.length;
		int[] c = new int[resultLength + 1];
		if (a.length >= b.length) {
			b = new int[b.length + (a.length - b.length)];
		} else {
			a = new int[a.length + (b.length - a.length)];
		}
		int sum = 0;
		int temp = 0;
		// TODO
		for (int i = a.length - 1; i >= 0; i--) {
			sum = a[i] + b[i] + temp;
			if (sum > 10) {
				c[i] = sum % 10;// lay phan nguyen
				temp = sum / 10;// lay phan du
			} else {
				c[i] = sum;
			}
		}
		return c;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see xmlConfig.IArrayUtil#multiArray(int[], int[])
	 */
	@Override
	public int[] multiArray(int[] a, int[] b) {
		int resultLength = (a.length > b.length) ? a.length : b.length;
		int[] c = new int[resultLength + 1];

		if (a.length >= b.length) {
			b = new int[b.length + (a.length - b.length)];
		} else {
			a = new int[a.length + (b.length - a.length)];
		}

		int res = 0;
		int temp = 0;
		// TODO
		for (int i = a.length - 1; i >= 0; i--) {
			res = a[i] * b[i] + temp;
			if (res > 10) {
				c[i] = res % 10;
				temp = res / 10;
			} else {
				c[i] = res;
			}
		}
		return c;
	}

	// TODO -, *
	/**
	 * count clumps
	 * 
	 * @param nums
	 * @return
	 */
	public int countClumps(int[] nums) {
		int[] newArrays = copyArray(nums);
		int count = 0;
		for (int i = 0; i <= newArrays.length - 2; i++) {
			for (int j = 0;; j++) {
				if ((newArrays[i + j] != newArrays[i + j + 1] && j >= 1)
						|| (newArrays[i + j] == newArrays[i + j + 1])
						&& (i + j + 2 >= newArrays.length)) {
					count++;
					i = i + j;
					break;
				}
			}
		}
		return count;
	}

	/**
	 * chuyen tu he co so 10 ve he co so 2
	 * 
	 * @param n
	 * @return
	 */
	public static List<Integer> convertTentoTwo(int n) {
		List<Integer> b = new ArrayList<Integer>();
		int phanNguyen = n;
		int phanDu = 0;
		for (int i = 0;; i++) {
			phanDu = phanNguyen % 2;
			phanNguyen = phanNguyen / 2;
			b.add(phanDu);
			if (phanNguyen == 0) {
				break;
			}
		}
		Collections.reverse(b);
		return b;
	}

	public static int majorIndex(String number) {
		int n = Integer.parseInt(number);
		if (n == 0) {
			return 0;
		}
		List<Integer> validIndexes = new ArrayList<Integer>();
		List<Integer> b = convertTentoTwo(n);

		IntStream.range(1, b.size()).map(i -> b.size() - i).forEach(index -> {
			if (b.get(index) == 1 && b.get(index - 1) == 0) {
				validIndexes.add(index);
			}
		});

		return validIndexes.stream().mapToInt(element -> element).sum();
	}

	public static boolean Square_Check(int[] points) {
		int x1 = points[0];
		int y1 = points[1];
		int x2 = points[2];
		int y2 = points[3];
		int x3 = points[4];
		int y3 = points[5];
		int x4 = points[6];
		int y4 = points[7];
		double dist1 = (double) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1)
				* (y2 - y1));
		double dist2 = (double) Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2)
				* (y3 - y2));
		double dist3 = (double) Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3)
				* (y4 - y3));
		double dist4 = (double) Math.sqrt((x4 - x1) * (x4 - x1) + (y4 - y1)
				* (y4 - y1));
		if (dist1 == dist2 && dist2 == dist3 && dist3 == dist4) {
			return true;
		}
		return false;
	}

	public static int toms_wagons(int month, int day, int n) {
		int result = 0;
		int daysInMonth;
		if (month == 4 || month == 6 || month == 9 || month == 11) {
			daysInMonth = 30;
		} else if (month == 2) {
			daysInMonth = 28;
		} else {
			daysInMonth = 31;
		}
		if ((month >= 1 && month <= 12) && (day >= 1 && day <= daysInMonth)
				&& (n >= 0 && n <= 365)) {
			result = month * day * n;
		}
		return result;
	}

	/**
	 * Digit Sum Range [a, b]
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static int digitSumRange(int a, int b) {
		int result = 0;
		for (int i = a; i <= b; i++) {
			result += digitSumIndex(i);
		}
		return result;
	}

	private static int digitSumIndex(int n) {
		int result = 0;
		while (n >= 10) {
			result += n % 10;
			n = n / 10;
		}
		return (result += n);
	}

	/**
	 * kSub
	 * 
	 * @param k
	 * @param nums
	 * @return
	 */
	public static int kSubSequences(int k, int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			int sum = 0;
			for (int j = i; j < nums.length; j++) {
				sum = sum + nums[j];
				if (sum % k == 0) {
					count++;
				}
			}
		}
		return count;
	}

	/**
	 * code fights Tournament
	 * 
	 * @param p
	 * @param s
	 * @return
	 */
	public static int[] codeFightsTournament(int position, int score) {
		int[] a = new int[2];
		a[0] = (int) (4000 * Math.floor(Math.pow(0.5, position)));
		a[1] = (position == 1) ? 2 * score : score;
		return a;
	}

	public static String remainFib(String number) {
		int num = Integer.parseInt(number);
		int n = 0;
		int k = 3;
		while (n != num) {
			if (!isFibonacci(k++)) {
				n++;
			}
		}
		return String.valueOf(k - 1);
	}

	private static boolean isFibonacci(int n) {
		int fiboValue = 0;
		int i = 1;
		while (fiboValue < n) {
			fiboValue = fibo(i);
			i++;
		}
		return fiboValue == n;
	}

	// tinh so fibo o vi tri tu nhien n.
	public static int fibo(int n) {
		if (n == 1 || n == 0) {
			return 1;
		}
		if (n == 2) {
			return 2;
		}
		if (n == 3) {
			return 3;
		}

		return fibo(n - 1) + fibo(n - 2);
	}

	public static int primeDistance(String number) {
		Integer n = Integer.parseInt(number);
		if (n == 0) {
			return 2;
		} else if (n == 1) {
			return 1;
		} else if (isPrime(n) || n == 2) {
			return 0;
		}
		int i = 0;
		while (true) {
			i++;
			if (isPrime(n - i) || isPrime(n + i)) {
				return i;
			}
		}
	}

	private static boolean isPrime(int n) {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	// Last Digit Factorial
	private static int giaiThua(int n) {
		int giaiThua = 1;
		for (int i = 1; i <= n; i++) {
			giaiThua = giaiThua * i;
		}
		return giaiThua;
	}

	public static String removeZero(String input) {
		String newInput = input;
		for (int i = input.length() - 1; i >= 0; i--) {
			if (input.charAt(i) == 0) {
				newInput = new StringBuilder(input).deleteCharAt(i).toString();
			} else {
				break;
			}
		}
		return newInput;
	}

	public static int lastDigitsFactorial(String n, int k) {
		String s = removeZero(String.valueOf(giaiThua(Integer.parseInt(n))));
		String kElements = s.substring(s.length() - k - 1);
		String replaceElement = kElements.replaceAll("0", "");
		Integer result = Integer.parseInt(replaceElement);
		return result;
	}

	public static int[] deDup(int[] a) {
		Set<Integer> array = new HashSet<Integer>();
		for (int i = 0; i < a.length - 1; i++) {
			array.add(a[i]);
		}
		int[] result = new int[array.size()];
		// use iterator : add array->result
		Iterator<Integer> re = array.iterator();
		int i = 0;
		while (re.hasNext()) {
			result[i] = (int) re.next();
			i++;
		}
		return result;
	}

	public static int sumDivisors(int number) {
		int sum = 0;
		List<Integer> array = new ArrayList<Integer>();
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				array.add(i);
			}
		}
		for (int i = 0; i < array.size(); i++) {
			if (!isPrime(array.get(i))) {
				sum += array.get(i);
			}
		}
		return sum;
	}
}
