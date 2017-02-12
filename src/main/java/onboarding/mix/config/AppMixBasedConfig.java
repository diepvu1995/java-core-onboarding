package onboarding.mix.config;

import onboarding.java.config.AppJavaBasedConfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

//this is class config use: Referencig xml to javaconfig

@Configuration
@Import(AppJavaBasedConfig.class)
@ImportResource("classpath:springContext.xml")
public class AppMixBasedConfig {
}
