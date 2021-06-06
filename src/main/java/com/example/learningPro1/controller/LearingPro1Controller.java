package com.example.learningPro1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@CrossOrigin("*")
@RestController
public class LearingPro1Controller {
	@Autowired
	StringResponse stringResponse;
	
	@GetMapping(value = "/backendCall", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<StringResponse> BackendCall() {
		stringResponse.setResponse("PineApple");
		return new ResponseEntity<StringResponse>(stringResponse, HttpStatus.OK);
	}
	
	@GetMapping("/backendCall1")
	public ResponseEntity<StringResponse> BackendCall2() {
		stringResponse.setResponse(new RestTemplate().getForObject("http://localhost:9004/backendCall2", String.class));
		return new ResponseEntity<StringResponse>(stringResponse, HttpStatus.OK);
	}

}
