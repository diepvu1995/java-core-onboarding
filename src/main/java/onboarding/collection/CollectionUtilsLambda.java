package onboarding.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.junit.Assert;

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

        Assert.assertEquals(sortedArray1, sortedArray2);
        Assert.assertEquals(sortedArray1, sortedArray3);
        Assert.assertEquals(sortedArray2, sortedArray3);

        return sortedArray1;
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
        List<Integer> findArray = new ArrayList<Integer>(nums);
        // tim vi tri lan suat hien dau tien cua doi tuong 6.
        int posOf6 = nums.stream().filter(element -> element.intValue() == 6).findFirst().get();
        return (posOf6 == 0 || posOf6 == findArray.size() - 1) ? true : false;
    }
}

class MyComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        // desc: O2 - O1, asc = O1 -O2;
        return o2.intValue() - o1.intValue();
    }
}