package onboarding.spring.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import onboarding.java.config.AppJavaBasedConfig;
import onboarding.utils.IStringUtil;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppJavaBasedConfig.class)
public class JavaConfigTest {
	@Autowired
	private IStringUtil stringUtil;

	@Test
	public void notNull() {
		Assert.assertNotNull(this.stringUtil);
	}

	@Test
	public void testTopping2_1() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("ice cream", "cherry");
		Map<String, String> map1 = stringUtil.topping2(map);
		Assert.assertEquals("yogurt", map1.keySet().toArray()[0]);
	}

	@Test
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

	@Test
	public void testTopping2_3() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("yogurt", "salt");
		Map<String, String> map1 = stringUtil.topping2(map);
		Assert.assertEquals("yogurt", map1.keySet().toArray()[0]);
		Assert.assertEquals("salt", map1.values().toArray()[0]);
	}

	@Test
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

	@Test
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

	@Test
	public void testWordCount_3() {
		String[] wordCount = { "c", "c", "c", "c" };
		Map<String, Integer> map = stringUtil.wordCount(wordCount);
		Assert.assertEquals(4, map.values().toArray()[0]);
		Assert.assertEquals("c", map.keySet().toArray()[0]);
	}

	@Test
	public void testzipText_1() {
		// Assert.assertEquals("a2bcd2efda2",
		// stringUtil.zipText("aabcddefdaa"));
	}

	@Test
	public void testzipText_2() {
		 Assert.assertEquals("a9", stringUtil.zipText("aaaaaaaaa"));
	}

	@Test
	public void testzipText_3() {
		// Assert.assertEquals("a9b", stringUtil.zipText("aaaaaaaaab"));
	}

	@Test
	public void testzipText_4() {
		// Assert.assertEquals("ba9b", stringUtil.zipText("baaaaaaaaab"));
	}

	@Test
	public void testzipText_5() {
		// Assert.assertEquals("b2abc2w2a8be3g",
		// stringUtil.zipText("bbabccwwaaaaaaaabeeeg"));
	}

}
