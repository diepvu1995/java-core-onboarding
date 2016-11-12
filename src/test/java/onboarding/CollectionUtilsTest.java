package onboarding;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import onboarding.collection.CollectionUtils;

public class CollectionUtilsTest {
	CollectionUtils utils;

	@SuppressWarnings("static-access")
	@Test
	public void sortByDesc_test() {
		List<Integer> result = utils.sortByDesc(Arrays.asList(1, 2, 3, 4, 5));
		Assert.assertEquals(5, result.get(0).intValue());
		Assert.assertEquals(4, result.get(1).intValue());
		Assert.assertEquals(3, result.get(2).intValue());
		Assert.assertEquals(2, result.get(3).intValue());
		Assert.assertEquals(1, result.get(4).intValue());

	}

	@SuppressWarnings("static-access")
	@Test
	public void sortByAsc_test() {
		List<Integer> result = utils.sortByAsc(Arrays.asList(5, 4, 3, 2, 1));
		Assert.assertEquals(1, result.get(0).intValue());
		Assert.assertEquals(2, result.get(1).intValue());
		Assert.assertEquals(3, result.get(2).intValue());
		Assert.assertEquals(4, result.get(3).intValue());
		Assert.assertEquals(5, result.get(4).intValue());
	}

	@SuppressWarnings("static-access")
	@Test
	public void reverse_test() {
		List<Integer> result = utils.reverse(Arrays.asList(5, 6, 3, 7, 1));
		Assert.assertEquals(1, result.get(0).intValue());
		Assert.assertEquals(7, result.get(1).intValue());
		Assert.assertEquals(3, result.get(2).intValue());
		Assert.assertEquals(6, result.get(3).intValue());
		Assert.assertEquals(5, result.get(4).intValue());
	}

	@SuppressWarnings("static-access")
	@Test
	public void sort_test_true() {
		List<Integer> result = utils.sort(Arrays.asList(5, 6, 3, 7), true);
		Assert.assertEquals(3, result.get(0).intValue());
		Assert.assertEquals(5, result.get(1).intValue());
		Assert.assertEquals(6, result.get(2).intValue());
		Assert.assertEquals(7, result.get(3).intValue());
	}

	@SuppressWarnings("static-access")
	@Test
	public void sort_test_false() {
		List<Integer> result = utils.sort(Arrays.asList(5, 6, 3, 7), false);
		Assert.assertEquals(7, result.get(0).intValue());
		Assert.assertEquals(6, result.get(1).intValue());
		Assert.assertEquals(5, result.get(2).intValue());
		Assert.assertEquals(3, result.get(3).intValue());
	}

	@SuppressWarnings("static-access")
	@Test
	public void find_test_true() {
		boolean result = utils.find(Arrays.asList(2, 3, 4, 5), 3);
		Assert.assertTrue(result);
	}

	@SuppressWarnings("static-access")
	@Test
	public void find_test_false() {
		boolean result = utils.find(Arrays.asList(2, 3, 4, 5), 6);
		Assert.assertFalse(result);
	}

	@SuppressWarnings("static-access")
	@Test
	public void add_test() {
		List<Integer> result = utils
				.addElement(Arrays.asList(1, 2, 3, 4), 5, 4);
		Assert.assertEquals(1, result.get(0).intValue());
		Assert.assertEquals(2, result.get(1).intValue());
		Assert.assertEquals(3, result.get(2).intValue());
		Assert.assertEquals(4, result.get(3).intValue());
		Assert.assertEquals(5, result.get(4).intValue());

	}

	@SuppressWarnings("static-access")
	@Test
	public void remove_test() {
		List<Integer> result = utils
				.removeByValue(Arrays.asList(1, 2, 3, 1), 1);
		Assert.assertEquals(2, result.size());
		Assert.assertFalse(utils.find(result, 1));
	}

	@SuppressWarnings("static-access")
	@Test
	public void removeIndex_test() {
		List<Integer> result = utils.removeByIndex(
				Arrays.asList(1, 2, 3, 4, 5), 4);
		Assert.assertFalse(utils.find(result, 5));
	}

	@SuppressWarnings("static-access")
	@Test
	public void removeSubArray_test() {
		List<Integer> result = utils.removeBySubArray(
				Arrays.asList(1, 2, 3, 4, 5), Arrays.asList(1, 2));
		Assert.assertFalse(utils.find(result, 1));
		Assert.assertFalse(utils.find(result, 2));
		Assert.assertEquals(3, result.size());
	}

	@SuppressWarnings("static-access")
	@Test
	public void find6_test_false() {
		Assert.assertFalse(utils.find6(Arrays.asList(2, 6, 3, 4)));
		Assert.assertTrue(utils.find6(Arrays.asList(6, 6, 3, 4)));
	}

	@SuppressWarnings("static-access")
	@Test
	public void commonEnd_test_false() {
		Assert.assertTrue(utils.commonEnd(Arrays.asList(1, 3, 4, 2),
				Arrays.asList(1, 2, 3, 3)));
	}

	@SuppressWarnings("static-access")
	@Test
	public void no23_test_false() {
		Assert.assertTrue(utils.no23(Arrays.asList(1, 4, 5, 6, 6, 7, 7)));
	}

	@SuppressWarnings("static-access")
	@Test
	public void makeMiddle_test() {
		List<Integer> result = utils.makeMidle(Arrays.asList(7, 2, 3, 4, 5, 6));
		// Assert.assertEquals(7, result.get(0).intValue());
	}

	@SuppressWarnings("static-access")
	@Test
	public void unlucky1_test_false() {
		// Assert.assertTrue(utils.unlucky1(Arrays.asList(8, 1, 3, 4, 5)));
	}

	@SuppressWarnings("static-access")
	@Test
	public void maxEnd_test() {
		List<Integer> result = utils.maxEnd(Arrays.asList(1, 2, 3));
		Assert.assertEquals(3, result.get(0).intValue());
		Assert.assertEquals(3, result.get(1).intValue());
		Assert.assertEquals(3, result.get(2).intValue());
	}

	@SuppressWarnings("static-access")
	@Test
	public void plusTwo2_test() {
		List<Integer> result = utils.plusTwo(Arrays.asList(1, 2),
				Arrays.asList(3, 4));
		Assert.assertEquals(1, result.get(0).intValue());
		Assert.assertEquals(2, result.get(1).intValue());
		Assert.assertEquals(3, result.get(2).intValue());
		Assert.assertEquals(4, result.get(3).intValue());
		Assert.assertEquals(4, result.size());
	}

	@SuppressWarnings("static-access")
	@Test
	public void rotate_test() {
		List<Integer> result = utils.rotateLeft3(Arrays.asList(1, 2, 3));
		Assert.assertEquals(2, result.get(0).intValue());
		Assert.assertEquals(3, result.get(1).intValue());
		Assert.assertEquals(1, result.get(2).intValue());
	}

	@SuppressWarnings("static-access")
	@Test
	public void biggerTwo_test() {
		List<Integer> result = utils.biggerTwo(Arrays.asList(1, 2),
				Arrays.asList(3, 4));
		Assert.assertEquals(3, result.get(0).intValue());
		Assert.assertEquals(4, result.get(1).intValue());
		Assert.assertEquals(2, result.size());
	}

	@SuppressWarnings("static-access")
	@Test
	public void swapEnds_test() {
		List<Integer> result = utils.swapEnds(Arrays.asList(1, 2, 3));
		Assert.assertEquals(3, result.get(0).intValue());
		Assert.assertEquals(2, result.get(1).intValue());
		Assert.assertEquals(1, result.get(2).intValue());
	}
}
