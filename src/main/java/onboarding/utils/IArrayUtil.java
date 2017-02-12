package onboarding.utils;

public interface IArrayUtil {

	boolean find(int[] array, int findingValue);

	boolean find6(int[] nums);

	boolean commonEnd(int[] a, int[] b);

	boolean no23(int[] nums);

	boolean unlucky1(int[] nums);

	int[] maxEnd(int[] nums);

	// TODO : DUNG 1 VONG LAP TRONG MANG C
	int[] plusTwo(int[] a, int[] b);

	int[] plusTwo2(int[] a, int[] b);

	/**
	 * 
	 * @param nums
	 * @return
	 */
	int[] rotateLeft3(int[] nums);

	/**
	 * ham so sanh tong 2 mang
	 * 
	 * @param a
	 * @param b
	 * @return array bigger
	 */
	int[] biggerTow(int[] a, int[] b);

	/**
	 * swap first and end
	 * 
	 * @param nums
	 * @return a array is swaped value first and end
	 */
	int[] swapEnds(int[] nums);

	/**
	 * thay doi so 0 bang so le lon nhat ben phai
	 * 
	 * @param nums
	 * @return
	 */
	int[] zeroMax(int[] nums);

	/**
	 * 
	 * @param nums
	 * @return
	 */
	boolean twoTwo(int[] nums);

	/**
	 * tim gia tri median trong mot mang
	 * 
	 * @param nums
	 * @return
	 */
	int median(int[] nums);

	/**
	 * 
	 * @param nums
	 * @return
	 */
	boolean more14(int[] nums);

	/**
	 * kiem tra 3 so lien tiep
	 * 
	 * @param a
	 * @return true neu trong mang co 3 so lien tiep, false neu k co
	 */
	boolean tripleUp(int[] a);

	/**
	 * tinh tong 2 mang o tung vi tri
	 * 
	 * @param a
	 * @param b
	 * @return sumArray of a vs b
	 */
	int[] sumArray(int[] a, int[] b);

	int[] multiArray(int[] a, int[] b);

	// TODO -, *
	/**
	 * count clumps
	 * 
	 * @param nums
	 * @return
	 */
	public int countClumps(int[] nums);

}