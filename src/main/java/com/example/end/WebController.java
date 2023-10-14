package com.example.end;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
	
	@GetMapping(value="/get")
	public String print() {
		return "Hello";
	}

}
