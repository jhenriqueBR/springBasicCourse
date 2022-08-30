package org.example.vendas.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@Value("${application.name}")
	private String applicationName;

	@Autowired
	@Qualifier("programmerName")
	private String programmerName;

	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello World :) - " + applicationName + programmerName;
	}
}
