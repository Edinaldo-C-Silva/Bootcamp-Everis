package com.dio.springboot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import lombok.Getter;
import lombok.Setter;

@Configuration
@ConfigurationProperties("spring.datasource")
@Getter
@Setter
public class DBConfiguration {
	
	private String driverClassMain;
	private String url;
	@SuppressWarnings("unused")
	private String username;
	@SuppressWarnings("unused")
	private String password;
	
	@Profile("dev")
	@Bean
	public String testDatabaseConnection() {
		System.out.println("DB Connection for DEV - H2");
		System.out.println(driverClassMain);
		System.out.println(url);
		
		return "DB Connection to H2_TEST - Test instance";
	}
	
	@Profile("prod")
	@Bean
	public String prodDatabaseConnection() {
		System.out.println("DB Connection for Production - MySQL");
		System.out.println(driverClassMain);
		System.out.println(url);
		
		return "DB Connection to MYSQL_PROD - Production instance";
	}
	
}
