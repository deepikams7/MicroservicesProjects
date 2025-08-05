package com.nt.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.entity.Tourist;
import com.nt.service.ITouristMgmtService;

@RestController
@RequestMapping("/tourist-api")
public class TouristOperationController {
	
	@Autowired
	private  ITouristMgmtService touristService;
	
	@PostMapping("/register")
	public ResponseEntity<String> registerTourist(@RequestBody Tourist tourist)
	{
		try {
			String newMsg= touristService.registerTourist(tourist);	
			return new ResponseEntity<String>(newMsg, HttpStatus.CREATED);
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}	

	@GetMapping("/report")
	public ResponseEntity<?> showAllTourist(){
		try {
			List<Tourist> list =touristService.getAllTourist();
			return new ResponseEntity<List<Tourist>>(list,HttpStatus.OK);
		} catch (Exception e) {
			// TODO Auto-generated catch block
						return new ResponseEntity<String>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
		}
	
}
