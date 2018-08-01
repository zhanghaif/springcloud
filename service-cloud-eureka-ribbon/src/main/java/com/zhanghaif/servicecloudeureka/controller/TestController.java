package com.zhanghaif.servicecloudeureka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.zhanghaif.servicecloudeureka.entity.User;

@RestController
public class TestController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/test")
	public User get() {
		return this.restTemplate.getForObject("http://service-cloud-eureka-user/test", User.class);
	}
}
