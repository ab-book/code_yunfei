package com.wisely.highlight_spring4.ch3.fortest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
@Configuration
public class TestConfig {
	@Bean
	@Profile("dev")
	public TestBean devTestBean() {
		return new TestBean("from development profile");
	}

	@Bean
	@Profile("prod")
	public TestBean prodTestBean() {
		return new TestBean("from production profile");
	}

}
