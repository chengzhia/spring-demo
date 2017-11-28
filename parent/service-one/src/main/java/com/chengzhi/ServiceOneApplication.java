package com.chengzhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServiceOneApplication {
	public static void main(String[] args) {
		SpringApplication.run(ServiceOneApplication.class, args);

	}
}
