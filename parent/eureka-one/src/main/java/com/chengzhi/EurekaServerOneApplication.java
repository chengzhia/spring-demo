package com.chengzhi;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerOneApplication {
	public static void main(String[] args) {
		new SpringApplicationBuilder(EurekaServerOneApplication.class)
				.web(true).run(args);
	}
}
