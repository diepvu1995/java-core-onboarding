package onboarding.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CollectionUtils {
    /**
     * sap xep mang giam dan
     * 
     * @param array
     * @return a array desending
     */
    public static List<Integer> sortByDesc(List<Integer> array) {
        List<Integer> sortedArray = new ArrayList<Integer>(array);
        sortedArray.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.intValue() - o1.intValue();
            }
        });
        return sortedArray;
    }
}
