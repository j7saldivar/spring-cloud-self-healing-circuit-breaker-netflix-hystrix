package com.jorgesaldivar.controller;

import java.util.Random;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherServiceController {

	private String[] weather = new String[] { "sunny", "cloudy", "rainy", "windy" };

	@RequestMapping("/weather")
	public String getWeather() {
		return weather[new Random().nextInt(4)];
	}
	
}
