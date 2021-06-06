package com.example.learningPro1.controller;

import org.springframework.stereotype.Component;

@Component
public class StringResponse {

    private String response;

    
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
}
