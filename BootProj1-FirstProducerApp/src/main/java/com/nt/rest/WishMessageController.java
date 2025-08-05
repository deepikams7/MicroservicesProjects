package com.nt.rest;

import java.time.LocalDateTime;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/messageapi")
public class WishMessageController {

	@GetMapping("/wish")
	public ResponseEntity<String> showMessage(){
		//get System Date and Time
		LocalDateTime ldt = LocalDateTime.now();
		//get current hour of the day
		int hour = ldt.getHour();
		
		String msg = null;
		//generate wish message
		if(hour<12)
			msg = "Good Morning";
		else if(hour < 16)
			msg ="Good Afternoon";
		else if(hour < 20)
			msg ="Good Evening";
		else 
			msg ="Good Night";
		return new ResponseEntity<String>(msg,HttpStatus.OK);
		
}
	@GetMapping("/ageinfo")
	public ResponseEntity<Map<String,Integer>> showAgesInfo(){
	
		Map<String,Integer> map = Map.of("raja",20,"ramesh",10,"suresh",2);
		return new ResponseEntity<Map<String,Integer>>(map,HttpStatus.OK);
	}
}
