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
	 * 
	 * @param array
	 * @param newValue
	 * @param newPosition
	 * @return newArray , add newValue in newPosition
	 */
	public static int[] addElement(int[] array, int newValue, int newPosition) {
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
	public static int[] removeByValue(int[] array, int removedValue) {
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
	public static int[] removeByIndex(int[] array, int removedIndex) {
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
	public static int[] removeBySubArray(int[] array, int[] removeArray) {
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

	public boolean find6(int[] nums) {
		// lay ra vi tri cua so 6 trong mang nums
		int a = findIndex(nums, 6);
		return (a == 0 || a == nums.length - 1) ? true : false;
	}

	public boolean commonEnd(int[] a, int[] b) {
		// neu phan tu dau hoac phan tu coi cua 2 mang bang nhau -> return true
		return (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]) ? true
				: false;
	}

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

	public static int[] makeMidle(int[] nums) {
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

	public int[] plusTwo2(int[] a, int[] b) {
		// tao mang moi co do dai = tong do dai 2 mang a b
		int[] c = new int[a.length + b.length];
		// copy het gia tri mang a - > c, b->c
		for (int i = 0; i < c.length; i++) {
			c[i] = (i < a.length) ? a[i] : b[i - a.length];
		}
		return c;
	}

	/**
	 * 
	 * @param nums
	 * @return
	 */
	public int[] rotateLeft3(int[] nums) {
		int[] a = copyArray(nums);
		for (int i = 1; i < a.length; i++) {
			a[i] = nums[i - 1];
		}
		a[0] = nums[nums.length - 1];
		return a;
	}

	// ham tinh tong mot mang
	public static int sum(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		return sum;
	}

	/**
	 * ham so sanh tong 2 mang
	 * 
	 * @param a
	 * @param b
	 * @return array bigger
	 */
	public int[] biggerTow(int[] a, int[] b) {
		return (sum(a) > sum(b)) ? a : b;
	}

	/**
	 * swap first and end
	 * 
	 * @param nums
	 * @return a array is swaped value first and end
	 */
	public int[] swapEnds(int[] nums) {
		int[] a = copyArray(nums);
		int temp = a[0];
		a[0] = a[a.length - 1];
		a[a.length - 1] = temp;
		return a;
		// TODO khong dung bien tam, chi dung 2 gia tri a va b , hay doi cho a
		// va b
	}

	/**
	 * thay doi so 0 bang so le lon nhat ben phai
	 * 
	 * @param nums
	 * @return
	 */
	public int[] zeroMax(int[] nums) {
		// tao mot mang moi, copy gia tri nums->newarray
		int[] a = copyArray(nums);
		int temp = 0;
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

	/**
	 * 
	 * @param nums
	 * @return
	 */
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

	/**
	 * tim gia tri median trong mot mang
	 * 
	 * @param nums
	 * @return
	 */
	public int median(int[] nums) {
		return (nums.length % 2 == 0) ? (nums[(nums.length / 2) - 1] + nums[nums.length / 2]) / 2
				: nums[(nums.length - 1) / 2];
	}

	/**
	 * 
	 * @param nums
	 * @return
	 */
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

	/**
	 * kiem tra 3 so lien tiep
	 * 
	 * @param a
	 * @return true neu trong mang co 3 so lien tiep, false neu k co
	 */
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

	/**
	 * tinh tong 2 mang o tung vi tri
	 * 
	 * @param a
	 * @param b
	 * @return sumArray of a vs b
	 */
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
				c[i] = sum % 10;
				temp = sum / 10;
			} else {
				c[i] = sum;
			}
		}
		return c;
	}

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
	public static int countClumps(int[] nums) {
		int[] newArrays = copyArray(nums);
		int count = 0;
		for (int i = 0; i < newArrays.length - 1; i++) {
			if (newArrays[i] == newArrays[i + 1]) {
				count++;
			}
		}
		return count;
	}
}
