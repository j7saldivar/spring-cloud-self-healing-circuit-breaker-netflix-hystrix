package com.jorgesaldivar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.jorgesaldivar.service.GetTimeAppService;

@RestController
public class GetTimeAppController {

	private GetTimeAppService getTimeAppService;

	@Autowired
	public void setGetTimeAppService(GetTimeAppService getTimeAppService) {
		this.getTimeAppService = getTimeAppService;
	}

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@RequestMapping("/current/get-time")
	public String getWeather() {
		return String.join(" ", "The time now is:", getTimeAppService.getTime());
	}

}
