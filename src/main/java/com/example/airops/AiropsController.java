package com.example.airops;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AiropsController {

	@Value("${airopsname}") private String airopsName;

	@RequestMapping("/hello")
	public String airopsHello(){
		return "hello " + airopsName;
	}
}
