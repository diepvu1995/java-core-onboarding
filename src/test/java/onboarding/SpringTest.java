package onboarding;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import onboarding.java.IStringUtil;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=AppConfig.class)
public class SpringTest {
    @Autowired
    private IStringUtil stringUtil;
    
    @Test
    public void notNull(){
        Assert.assertNotNull(this.stringUtil);
    }
}
