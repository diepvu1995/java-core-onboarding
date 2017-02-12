package book.examples;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
// @ComponentScan(basePackageClasses = { ISpring4.class, IOnboardingJava.class
// })
public class CDPlayerConfig {
	@Bean
	public CompactDisc sgtPeppers() {
		return new SgtPeppers();
	}

	@Bean
	public CDPlayer cdPlayer() {
		return new CDPlayer(sgtPeppers());
	}

}
