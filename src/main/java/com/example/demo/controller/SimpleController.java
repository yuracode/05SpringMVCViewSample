package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
	@GetMapping("url1")
	public String urlTest1() {
		return "Hello Spring";
	}
}
