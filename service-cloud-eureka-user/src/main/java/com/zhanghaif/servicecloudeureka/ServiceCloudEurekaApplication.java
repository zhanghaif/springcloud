package com.zhanghaif.servicecloudeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceCloudEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceCloudEurekaApplication.class, args);
	}
}
