package com.practice.rest;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Greeting{
	
	private String greeting;
	private Date date;
	
	public Greeting(){
		this.greeting = "Hello World";
		this.date = new Date();
	}
	
	public Greeting(String word){
		this.greeting = "Hello " + word;
		this.date = new Date();
	}
	
	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(final String greeting) {
		this.greeting = greeting;
	}
	
	public Date getDate() {
		return date;
	}
}
