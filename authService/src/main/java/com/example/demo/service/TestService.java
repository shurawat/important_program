package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("singleton")
public class TestService {
	
	
	
	@Autowired
	Test2Component component;
	
	public TestService() {
		System.out.println("TestService created..");
	}
	
	
	@Lookup
	public Test2Component getComponent() {
		return component;
	}

	public void setComponent(Test2Component component) {
		this.component = component;
	}
	
	

}
