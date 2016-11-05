package onboarding;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import onboarding.collection.CollectionUtils;

public class CollectionUtilsTest {
    CollectionUtils utils;
    
    @SuppressWarnings("static-access")
    @Test
    public void sortByDesc_test(){
        List<Integer> result = utils.sortByDesc(Arrays.asList(1, 2, 3, 4, 5));
        Assert.assertEquals(result.get(0).intValue(), 5);
        Assert.assertEquals(result.get(1).intValue(), 4);
        Assert.assertEquals(result.get(2).intValue(), 3);
        Assert.assertEquals(result.get(3).intValue(), 2);
        Assert.assertEquals(result.get(4).intValue(), 1);
    }
}
