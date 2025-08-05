package com.nt.pms;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentServiceOperationsController {
	
	@GetMapping("/options")
	public ResponseEntity<String> getPaymentOptions(){
		return new ResponseEntity<String>("you can do payment using gpay,phonepe , etc", HttpStatus.OK);
	}

}
