package onboarding;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import onboarding.java.IStringUtil;
import onboarding.java.StringUtil;

@Configuration
public class AppJavaBasedConfig {

    @Bean
    public IStringUtil stringUtil() {
        return new StringUtil();
    }

    @Bean
    public App app() {
        return new App();
    }
}
