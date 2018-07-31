package com.zhanghaif.servicecloudeureka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;

@RestController
public class TestController {
	
	@Autowired
	private EurekaClient eurekaClient;
	
	@GetMapping("/test")
	public String get() {
		String data = "{name:张三,age:21}";
		return data;
	}
		
	@GetMapping("eureka-instance")
	public String service() {
		InstanceInfo instance = this.eurekaClient.getNextServerFromEureka("SERVICE-CLOUD-EUREKA-CLIENT2", false);
		return instance.getHomePageUrl();
	}
}
