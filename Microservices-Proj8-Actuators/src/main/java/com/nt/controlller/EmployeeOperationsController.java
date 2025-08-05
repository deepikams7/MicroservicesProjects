//EmployeeOperationsController.java
package com.nt.controlller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeOperationsController {

	@GetMapping("/show")
	public ResponseEntity<String> showData(){
		return new ResponseEntity<String>("from Employee Operations", HttpStatus.OK);
	}
	

}
