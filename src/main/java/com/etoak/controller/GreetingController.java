package com.etoak.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.etoak.bean.Greeting;

@RestController
public class GreetingController {
	private final String template = "Hello,%s";
	private final AtomicLong counter=new AtomicLong();
	@GetMapping("/greeting")
	public Greeting greetings(@RequestParam(required = false,defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(),String.format(template, name));
	}
}
