package onboarding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import onboarding.utils.CollectionUtils;
import onboarding.utils.CollectionUtilsLambda;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */

public class ColectionUtilLAmdaTest {

	CollectionUtilsLambda lambda;

	// with version 3, add test in first of funtion ex: test

	@Test
	public void testFind6_true() {
		Assert.assertEquals(true, lambda.find6(Arrays.asList(1, 2, 3, 4, 6)));
	}

	@Test
	public void testFindIndex_true() {
		Assert.assertEquals(1, lambda.findIndex(Arrays.asList(1, 2, 3, 4), 2));

	}

	@Test
	public void testRemoveByValue_true() {
		List<Integer> result = lambda.removeByValue(Arrays.asList(2, 3, 4), 2);
		Assert.assertEquals(3, result.get(0).intValue());
		Assert.assertEquals(4, result.get(1).intValue());
		Assert.assertEquals(2, result.size());
	}

	@Test
	public void testNo23_true() {
		Assert.assertEquals(true, lambda.no23(Arrays.asList(1, 4)));
	}

	@Test
	public void testMaxEnd_true() {
		List<Integer> result = lambda.maxEnd(Arrays.asList(2, 3, 3, 8, 6, 4));
		Assert.assertEquals(4, result.get(0).intValue());
	}

	@Test
	public void testMore14_true() {
		Assert.assertEquals(true, lambda.more14(Arrays.asList(1, 1, 1, 4)));
	}

	@Test
	public void testAlbum_true() {
		List<CollectionUtilsLambda.Album> albums = new ArrayList<CollectionUtilsLambda.Album>();
		// create test data for album 1
		List<CollectionUtilsLambda.Track> tracks = new ArrayList<CollectionUtilsLambda.Track>();
		CollectionUtilsLambda.Track t = new CollectionUtilsLambda().new Track();
		t.rating = 4;
		CollectionUtilsLambda.Track t1 = new CollectionUtilsLambda().new Track();
		t1.rating = 5;
		tracks.add(t);
		tracks.add(t1);
		CollectionUtilsLambda.Album a1 = new CollectionUtilsLambda().new Album();
		a1.track = tracks;
		a1.name = "start";
		albums.add(a1);
		// create test data for album 2
		List<CollectionUtilsLambda.Track> track2s = new ArrayList<CollectionUtilsLambda.Track>();
		CollectionUtilsLambda.Track t21 = new CollectionUtilsLambda().new Track();
		t21.rating = 3;
		CollectionUtilsLambda.Track t22 = new CollectionUtilsLambda().new Track();
		t22.rating = 2;
		track2s.add(t21);
		track2s.add(t22);
		CollectionUtilsLambda.Album a2 = new CollectionUtilsLambda().new Album();
		a2.track = track2s;
		a2.name = "blue";
		albums.add(a2);
		// test
		List<CollectionUtilsLambda.Album> result = lambda.album(albums);
		Assert.assertEquals(1, result.size());
		Assert.assertEquals("start", result.get(0).name);
		Assert.assertEquals(4, result.get(0).track.get(0).rating);
	}

	@Test
	public void testTopping2_1() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("ice cream", "cherry");
		Map<String, String> map1 = CollectionUtils.topping2(map);
		Assert.assertEquals("yogurt", map1.keySet().toArray()[0]);
	}

	@Test
	public void testTopping2_2() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("spinach", "dirt");
		map.put("ice cream", "cherry");
		Map<String, String> map1 = CollectionUtils.topping2(map);
		Assert.assertEquals("yogurt", map1.keySet().toArray()[0]);
		Assert.assertEquals("cherry", map1.values().toArray()[0]);
		Assert.assertEquals("spinach", map1.keySet().toArray()[1]);
		Assert.assertEquals("ice cream", map1.keySet().toArray()[2]);
	}

	@Test
	public void testTopping2_3() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("yogurt", "salt");
		Map<String, String> map1 = CollectionUtils.topping2(map);
		Assert.assertEquals("yogurt", map1.keySet().toArray()[0]);
		Assert.assertEquals("salt", map1.values().toArray()[0]);
	}

	@Test
	public void testWordCount_1() {
		String[] wordCount = { "a", "b", "a", "c", "b" };
		Map<String, Integer> map = CollectionUtils.wordCount(wordCount);
		Assert.assertEquals(2, map.values().toArray()[0]);
		Assert.assertEquals(2, map.values().toArray()[1]);
		Assert.assertEquals(1, map.values().toArray()[2]);
		Assert.assertEquals("a", map.keySet().toArray()[0]);
		Assert.assertEquals("b", map.keySet().toArray()[1]);
		Assert.assertEquals("c", map.keySet().toArray()[2]);
		Entry<String, Integer> firstEntry = map.entrySet().iterator().next();
		Assert.assertEquals("a", firstEntry.getKey());
		Assert.assertEquals(2, firstEntry.getValue().intValue());
	}

	@Test
	public void testWordCount_2() {
		String[] wordCount = { "c", "b", "a" };
		Map<String, Integer> map = CollectionUtils.wordCount(wordCount);
		Assert.assertEquals(1, map.values().toArray()[0]);
		Assert.assertEquals(1, map.values().toArray()[1]);
		Assert.assertEquals(1, map.values().toArray()[2]);
		Assert.assertEquals("a", map.keySet().toArray()[0]);
		Assert.assertEquals("b", map.keySet().toArray()[1]);
		Assert.assertEquals("c", map.keySet().toArray()[2]);
	}

	@Test
	public void testWordCount_3() {
		String[] wordCount = { "c", "c", "c", "c" };
		Map<String, Integer> map = CollectionUtils.wordCount(wordCount);
		Assert.assertEquals(4, map.values().toArray()[0]);
		Assert.assertEquals("c", map.keySet().toArray()[0]);
	}

	@Test
	public void testzipText_1() {
		Assert.assertEquals("a2bcd2efda2",
				CollectionUtils.zipText("aabcddefdaa"));
	}

	@Test
	public void testzipText_2() {
		Assert.assertEquals("a9", CollectionUtils.zipText("aaaaaaaaa"));
	}

	@Test
	public void testzipText_3() {
		Assert.assertEquals("a9b", CollectionUtils.zipText("aaaaaaaaab"));
	}

	@Test
	public void testzipText_4() {
		Assert.assertEquals("ba9b", CollectionUtils.zipText("baaaaaaaaab"));
	}

	@Test
	public void testzipText_5() {
		Assert.assertEquals("b2abc2w2a8be3g",
				CollectionUtils.zipText("bbabccwwaaaaaaaabeeeg"));
	}
}
