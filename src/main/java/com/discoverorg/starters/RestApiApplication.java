package com.discoverorg.starters;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class RestApiApplication {

	public static void main(String[] args) {
        SpringApplication.run(RestApiApplication.class, args);
	}
}
