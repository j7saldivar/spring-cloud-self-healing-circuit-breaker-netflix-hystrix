package com.jorgesaldivar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class GetTimeAppService {

	private RestTemplate restTemplate;
	
	@Autowired
	public void setRestTemplate(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	@HystrixCommand(fallbackMethod = "unknown")
	public String getTime() {
		return restTemplate.getForEntity("http://gettime-service/get-time", String.class).getBody();
	}

	public String unknown() {
		return "unknown";
	}

}
