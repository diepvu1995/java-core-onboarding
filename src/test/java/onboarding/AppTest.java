package onboarding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import onboarding.collection.CollectionUtilsLambda;
import onboarding.java.ArrayUtil;
import onboarding.java.IStringUtil;
import onboarding.java.StringUtil;

import org.junit.Assert;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	private IStringUtil stringUtil = new StringUtil();

	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public AppTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp() {
		assertTrue(true);
	}

	CollectionUtilsLambda lambda;

	// with version 3, add test in first of funtion ex: test
	public void testFind6_true() {
		Assert.assertEquals(true, lambda.find6(Arrays.asList(1, 2, 3, 4, 6)));
	}

	public void testFindIndex_true() {
		Assert.assertEquals(1, lambda.findIndex(Arrays.asList(1, 2, 3, 4), 2));

	}

	public void testRemoveByValue_true() {
		List<Integer> result = lambda.removeByValue(Arrays.asList(2, 3, 4), 2);
		Assert.assertEquals(3, result.get(0).intValue());
		Assert.assertEquals(4, result.get(1).intValue());
		Assert.assertEquals(2, result.size());
	}

	public void testNo23_true() {
		Assert.assertEquals(true, lambda.no23(Arrays.asList(1, 4)));
	}

	public void testMaxEnd_true() {
		List<Integer> result = lambda.maxEnd(Arrays.asList(2, 3, 3, 8, 6, 4));
		Assert.assertEquals(4, result.get(0).intValue());
	}

	public void testMore14_true() {
		Assert.assertEquals(true, lambda.more14(Arrays.asList(1, 1, 1, 4)));
	}

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

	public void testClumps_1() {
		int[] arrayClumps = { 1, 1, 1, 1, 1 };
		int result = ArrayUtil.countClumps(arrayClumps);
		Assert.assertEquals(1, result);
	}

	public void testClumps_2() {
		int[] arrayClumps = { 1, 2, 2, 3, 4, 4 };
		int result = ArrayUtil.countClumps(arrayClumps);
		Assert.assertEquals(2, result);
	}

	public void testClumps_3() {
		int[] arrayClumps = { 1, 1, 2, 1, 1 };
		int result = ArrayUtil.countClumps(arrayClumps);
		Assert.assertEquals(2, result);
	}

	public void testConvertTentoTwo_1() {
		List<Integer> result = ArrayUtil.convertTentoTwo(5);
		Assert.assertEquals(1, result.get(0).intValue());
		Assert.assertEquals(0, result.get(1).intValue());
		Assert.assertEquals(1, result.get(2).intValue());
		Assert.assertEquals(3, result.size());
	}

	public void testMajorIndex() {
		Assert.assertEquals(7, ArrayUtil.majorIndex("83"));
	}

	public void testMajorIndex_1() {
		Assert.assertEquals(12, ArrayUtil.majorIndex("85"));
	}

	public void testMajorIndex_2() {
		Assert.assertEquals(0, ArrayUtil.majorIndex("0"));
	}

	public void testDigitSumRange() {
		Assert.assertEquals(46, ArrayUtil.digitSumRange(1, 10));
	}

	public void testKsubSequences() {
		int[] nums = { 9, 1, 3, 5, 2, 3 };
		Assert.assertEquals(4, ArrayUtil.kSubSequences(10, nums));
	}

	public void testRemainFib() {
		Assert.assertEquals("4", ArrayUtil.remainFib("1"));
		Assert.assertEquals("6", ArrayUtil.remainFib("2"));
		Assert.assertEquals("7", ArrayUtil.remainFib("3"));

	}

	public void testFibo() {
		Assert.assertEquals(1, ArrayUtil.fibo(1));
		// Assert.assertEquals(1, ArrayUtil.fibo(2));
		// Assert.assertEquals(3, ArrayUtil.fibo(3));
		// Assert.assertEquals(8, ArrayUtil.fibo(5));

	}

	public void testPrimeDistance() {
		Assert.assertEquals(2, ArrayUtil.primeDistance("0"));
		Assert.assertEquals(1, ArrayUtil.primeDistance("1"));
		Assert.assertEquals(0, ArrayUtil.primeDistance("2"));
		Assert.assertEquals(1, ArrayUtil.primeDistance("8"));
		Assert.assertEquals(1, ArrayUtil.primeDistance("500"));

	}

	public void testRemoveDup() {
		int[] a = { 1, 2, 3, 3, 3, 3 };
		int[] result = ArrayUtil.deDup(a);
		Assert.assertEquals(1, result[0]);
		Assert.assertEquals(2, result[1]);
		Assert.assertEquals(3, result[2]);

	}

	public void testTopping2_1() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("ice cream", "cherry");
		Map<String, String> map1 = stringUtil.topping2(map);
		Assert.assertEquals("yogurt", map1.keySet().toArray()[0]);
	}

	public void testTopping2_2() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("spinach", "dirt");
		map.put("ice cream", "cherry");
		Map<String, String> map1 = stringUtil.topping2(map);
		Assert.assertEquals("yogurt", map1.keySet().toArray()[0]);
		Assert.assertEquals("cherry", map1.values().toArray()[0]);
		Assert.assertEquals("spinach", map1.keySet().toArray()[1]);
		Assert.assertEquals("ice cream", map1.keySet().toArray()[2]);
	}

	public void testTopping2_3() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("yogurt", "salt");
		Map<String, String> map1 = stringUtil.topping2(map);
		Assert.assertEquals("yogurt", map1.keySet().toArray()[0]);
		Assert.assertEquals("salt", map1.values().toArray()[0]);
	}

	public void testWordCount_1() {
		String[] wordCount = { "a", "b", "a", "c", "b" };
		Map<String, Integer> map = stringUtil.wordCount(wordCount);
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

	public void testWordCount_2() {
		String[] wordCount = { "c", "b", "a" };
		Map<String, Integer> map = stringUtil.wordCount(wordCount);
		Assert.assertEquals(1, map.values().toArray()[0]);
		Assert.assertEquals(1, map.values().toArray()[1]);
		Assert.assertEquals(1, map.values().toArray()[2]);
		Assert.assertEquals("a", map.keySet().toArray()[0]);
		Assert.assertEquals("b", map.keySet().toArray()[1]);
		Assert.assertEquals("c", map.keySet().toArray()[2]);
	}

	public void testWordCount_3() {
		String[] wordCount = { "c", "c", "c", "c" };
		Map<String, Integer> map = stringUtil.wordCount(wordCount);
		Assert.assertEquals(4, map.values().toArray()[0]);
		Assert.assertEquals("c", map.keySet().toArray()[0]);
	}

	public void testzipText_1() {
		Assert.assertEquals("a2b1c1d2e1f1d1a2",
				stringUtil.zipText("aabcddefdaa"));
	}

	public void testzipText_2() {
		Assert.assertEquals("a9", stringUtil.zipText("aaaaaaaaa"));
	}

	public void testzipText_3() {
		Assert.assertEquals("a9b1", stringUtil.zipText("aaaaaaaaab"));
	}

	public void testzipText_4() {
		Assert.assertEquals("b1a9b1", stringUtil.zipText("baaaaaaaaab"));
	}

	public void testzipText_5() {
		Assert.assertEquals("b2a1b1c2w2a8b1e3g1",
				stringUtil.zipText("bbabccwwaaaaaaaabeeeg"));
	}

	public void testNumber() {
		Assert.assertTrue(stringUtil.isNumberic('2'));
	}

	public void testString() {
		Assert.assertEquals("aaa", stringUtil.returnString('a', 3));
	}

	public void testUnZipText_1() {
		Assert.assertEquals("aabb", stringUtil.unzipText("a2b2"));
	}

	public void testUnZipText_2() {
		Assert.assertEquals("aaaabbc", stringUtil.unzipText("a4b2c"));
	}

	public void testUnZipText_3() {
		Assert.assertEquals("abbbbbcccbdddd",
				stringUtil.unzipText("a1b5c3b1d4"));
	}

	public void testRemoveDupicate_1() {
		Assert.assertEquals("hllovryon",
				stringUtil.removeDuplicate("hello everyone"));
	}

	public void testMaxBlock_1() {
		Assert.assertEquals(2, stringUtil.maxBlock("hoopla"));
	}

	public void testMaxBlock_2() {
		Assert.assertEquals(5, stringUtil.maxBlock("abbCCCddBBBxxxxx"));
	}

	public void testMaxBlock_3() {
		Assert.assertEquals(0, stringUtil.maxBlock(""));
	}

	public void testSumDigit_1() {
		Assert.assertEquals(6, stringUtil.sumDigits("aa1bc2d3"));
	}

	public void testMirrorEnds_1() {
		Assert.assertEquals("ab", stringUtil.mirrorEnds("abXYZba"));
	}

	public void testMirrorEnds_2() {
		Assert.assertEquals("a", stringUtil.mirrorEnds("abca"));
	}

	public void testMirrorEnds_3() {
		Assert.assertEquals("aba", stringUtil.mirrorEnds("aba"));
	}

	public void testMirrorEnds_4() {
		Assert.assertEquals("a", stringUtil.mirrorEnds("abca"));
	}

	public void testLongWord_1() {
		Assert.assertEquals("love", stringUtil.longestWord("I love dogs"));
	}

	public void testLongWord_2() {
		Assert.assertEquals("", stringUtil.longestWord(""));
	}

	public void testLongWord_3() {
		Assert.assertEquals(" ", stringUtil.longestWord(" "));
	}

	public void testLongWord_4() {
		Assert.assertEquals("time", stringUtil.longestWord("fun&!! time"));
	}

	public void testPresentString_1() {
		String[] s = { "1", "2", "3", "4", "Code", "6", "Fight", "8", "9",
				"Code", "11", "12", "13", "Fight", "Code" };
		Assert.assertEquals(s, stringUtil.CodeFight(15));
	}

	public void testPresentString_2() {
		String[] s = { "1" };
		Assert.assertEquals(s, stringUtil.CodeFight(1));
	}

	public void testPresentString_35() {
		String[] s = { "1", "2", "3", "4", "Code", "6", "Fight", "8", "9",
				"Code", "11", "12", "13", "Fight", "Code", "16", "17", "18",
				"19", "Code", "Fight", "22", "23", "24", "Code", "26", "27",
				"Fight", "29", "Code", "31", "32", "33", "34", "CodeFight" };
		Assert.assertEquals(s, stringUtil.CodeFight(35));
	}

	public void testIqAddress() {
		Assert.assertEquals("12.04.08.05.5", stringUtil.iqAddress(16));
	}

	public void testIqAddress_1() {
		Assert.assertEquals("12.03.06.00.50.0", stringUtil.iqAddress(21));
	}

	public void testIqAddress_2() {
		Assert.assertEquals("1", stringUtil.iqAddress(1));
	}

	public void testSquareCheck() {
		int[] point = { 3, 4, 4, 3, 5, 4, 4, 5 };
		Assert.assertEquals(true, ArrayUtil.Square_Check(point));
	}

	public void testaaaaaa() {
		Assert.assertEquals(550, ArrayUtil.toms_wagons(5, 10, 11));
	}
}