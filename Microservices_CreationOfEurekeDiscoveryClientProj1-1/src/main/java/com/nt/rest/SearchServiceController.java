package com.nt.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/SearchService")
public class SearchServiceController {
	
	@GetMapping("/show")
	public ResponseEntity<String> showMessage(){
		return new ResponseEntity<String>("Welcome to Microservices Development",HttpStatus.OK);
	}

}
