package onboarding.java;

public class ArrayUtil {
	/**
	 * sap xep mang giam dan
	 * 
	 * @param array
	 * @return a array desending
	 */
	public static int[] sortByDesc(int[] array) {
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
	public static int[] reverse(int[] array) {
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
	public static int[] sortByAsc(int[] array) {
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
	public static int[] sort(int[] array, boolean isAsc) {
		int[] newArray = copyArray(array);
		return isAsc ? sortByAsc(newArray) : sortByDesc(newArray);
	}

	public boolean find(int[] array, int findingValue) {
		// duyet qua tat ca phan tu cua mang
		for (int i = 0; i < array.length; i++) {
			if (array[i] == findingValue) {
				return true;
			}
		}
		return false;

	}

	public static int findIndex(int[] array, int findingValue) {
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
	 * @param array
	 * @param newValue
	 * @param newPosition
	 * @return newArray , add newValue in newPosition
	 */
	public static int[] addElement(int[] array, int newValue, int newPosition) {
		// tao mot mang moi > mang cu 1 don vi de add a value
		int[] a = new int[array.length+1];
		// copy cac gia tri cua mang cu sang mang moi
		for (int i = 0; i < array.length; i++) {
			a[i] = array[i];
		}
		// neu do dai mang moi >= newPosition -> add newValue
		if (a.length >= newPosition) {
			a[newPosition] = newValue;
			//chuyen gia tri o vi tri cu nen vi tri moi 1 don vi,
			return a;
		}
		return a;
	}

	/**
	 * Remove one element into one array by value
	 * 
	 * @param array
	 * @param removedValue
	 * @return
	 */
	public static int[] removeByValue(int[] array, int removedValue) {
		return array;
	}

	/**
	 * Remove one element into one array by index
	 * 
	 * @param array
	 * @param removedIndex
	 * @return
	 */
	public static int[] removeByIndex(int[] array, int removedIndex) {
		return array;

	}

	/**
	 * Remove one sub array element from one parent array
	 * 
	 * @param array
	 * @param removeArray
	 * @return
	 */
	public static int[] removeBySubArray(int[] array, int[] removeArray) {
		return removeArray;

	}
}
