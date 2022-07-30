package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.TestService;

@RestController
@Scope("request")
public class TestController {
	
	@Autowired
	TestService service;
	
	@GetMapping("test")
	public void getTest() {
		System.out.println("########START#########");
		System.out.println(service.hashCode() + " " + service.hashCode());
		System.out.println(service.getComponent().hashCode() + " " + service.getComponent().hashCode());
		System.out.println("########END#########");
	}
	
	

}
