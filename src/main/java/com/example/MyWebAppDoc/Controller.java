package com.example.MyWebAppDoc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping("/get")
	public String gets() {
		return "Hello world";
	}

}
