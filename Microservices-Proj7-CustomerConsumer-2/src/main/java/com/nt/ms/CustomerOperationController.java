package com.nt.ms;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerOperationController {
	@Value("${db.user}")
	private String uname;
	@Value("${db.pwd}")
	private String pwd;
	
	@GetMapping("/show")
	public ResponseEntity<String> showConfigServer(){
		return new ResponseEntity<String>("CustomerData Collected from config server is :: "+uname+"......."+pwd,HttpStatus.OK);
	}

}
