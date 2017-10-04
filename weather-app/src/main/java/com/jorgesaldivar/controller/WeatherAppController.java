package com.jorgesaldivar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.jorgesaldivar.service.WeatherAppService;

@RestController
public class WeatherAppController {

	private WeatherAppService weatherAppService;

	@Autowired
	public void setWeatherAppService(WeatherAppService weatherAppService) {
		this.weatherAppService = weatherAppService;
	}

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@RequestMapping("/current/weather")
	public String getWeather() {
		return String.join(" ", "The current weather is:", weatherAppService.getWeather());
	}

}
