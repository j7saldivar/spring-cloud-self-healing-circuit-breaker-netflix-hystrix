package com.jorgesaldivar.controller;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetTimeServiceController {

	@RequestMapping("/get-time")
	public String getTime() {
		return LocalDateTime.now().toString();
	}
	
}
