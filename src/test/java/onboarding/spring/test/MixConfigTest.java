package onboarding.spring.test;

import onboarding.utils.IArrayUtil;
import onboarding.utils.IStringUtil;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
// @ContextConfiguration(classes = UtilConfig.class)
@ContextConfiguration("/util-config.xml")
public class MixConfigTest {
	@Autowired
	private IStringUtil stringUtil;
	@Autowired
	private IArrayUtil arrayUtil;

	@Test
	public void notNull() {
		Assert.assertNotNull(this.stringUtil);
	}

	@Test
	public void testClumps_1() {
		int[] arrayClumps = { 1, 1, 1, 1, 1 };
		int result = arrayUtil.countClumps(arrayClumps);
		Assert.assertEquals(1, result);
	}

}
