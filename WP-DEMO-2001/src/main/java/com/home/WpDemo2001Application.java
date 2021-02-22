package com.home;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class WpDemo2001Application {

	public static void main(String[] args) {
		SpringApplication.run(WpDemo2001Application.class, args);
	}

}
