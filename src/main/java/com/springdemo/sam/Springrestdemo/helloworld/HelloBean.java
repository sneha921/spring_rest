package com.springdemo.sam.Springrestdemo.helloworld;

public class HelloBean {
	
	private String message;
	private String name;
	
	
	
	public HelloBean() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public  HelloBean(String message) {
		this.message=message;
		}
	
	@Override
	public String toString() {
		return "HelloBean [message=" + message + "]";
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}



}
