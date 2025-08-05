package com.nt.bms;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/billing")
public class BillingServiceOperationsController {
	@Autowired
	private LoadBalancerClient clientcomp;
	
	
	@GetMapping("/show")
	public ResponseEntity<String> showBillingAmount(){
		//randomly generate the bill amount
		double billAmount = new Random().nextDouble(100000.0);
		
		//use clinet comp to get provider ms related service instance from eureka server that is havaing less load factor
		ServiceInstance instance = clientcomp.choose("PAYMENT-SERVICE");
		
		
		String uri =instance.getUri()+"/payment/options";
		System.out.println(uri);
		//create REstTemplate
		RestTemplate template = new RestTemplate();
		ResponseEntity<String> response = template.exchange(uri,HttpMethod.GET, null,String.class);		
		String finalResult ="Bill Amount" +billAmount+"and payment options are :: " +response.getBody();
		return new ResponseEntity<String>(finalResult , HttpStatus.OK);
		
	}

}
