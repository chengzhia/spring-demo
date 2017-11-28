package com.chengzhi.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("query")
	public String query() {
		return restTemplate.getForEntity("http://service/hello/query", String.class).getBody();
	}
}
