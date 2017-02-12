package onboarding.spring.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import onboarding.java.config.AppJavaBasedConfig;
import onboarding.utils.IStringUtil;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppJavaBasedConfig.class)
public class JavaConfigTest {
	@Autowired
	private IStringUtil stringUtil;

	@Test
	public void notNull() {
		Assert.assertNotNull(this.stringUtil);
	}
}
