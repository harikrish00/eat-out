package com.krishcoder.eatout;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@EnableAutoConfiguration
@SpringBootApplication
@EnableJpaAuditing
public class EatoutApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		new EatoutApplication().configure(new SpringApplicationBuilder(EatoutApplication.class)).run(args);
	}
}

