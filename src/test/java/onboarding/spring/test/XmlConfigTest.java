package onboarding.spring.test;

import onboarding.utils.IArrayUtil;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/springContext.xml")
public class XmlConfigTest {
	@Autowired
	private IArrayUtil arrayUtil;

	@Test
	public void testClumps_1() {
		int[] arrayClumps = { 1, 1, 1, 1, 1 };
		int result = arrayUtil.countClumps(arrayClumps);
		Assert.assertEquals(1, result);
	}

	@Test
	public void testClumps_2() {
		int[] arrayClumps = { 1, 2, 2, 3, 4, 4 };
		int result = arrayUtil.countClumps(arrayClumps);
		Assert.assertEquals(2, result);
	}

	@Test
	public void testClumps_3() {
		int[] arrayClumps = { 1, 1, 2, 1, 1 };
		int result = arrayUtil.countClumps(arrayClumps);
		Assert.assertEquals(2, result);
	}

}
