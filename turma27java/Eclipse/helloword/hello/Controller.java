package com.helloword.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/Hello")
public class Controller {

	@GetMapping
	public String hello() {
		return "Hello Generation!!!";
	}
}
