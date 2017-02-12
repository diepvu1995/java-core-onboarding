package onboarding.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import onboarding.App;
import onboarding.utils.IStringUtil;
import onboarding.utils.StringUtil;

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
