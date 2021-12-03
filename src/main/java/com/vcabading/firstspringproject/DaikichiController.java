package com.vcabading.firstspringproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiController {
	
	@RequestMapping("")
	public String daikichi() {
		return "Welcome";
	}

	@RequestMapping("/today")
	public String daikichiToday() {
		return "Today, you will find luck in all your endeavors!";
	}
}
