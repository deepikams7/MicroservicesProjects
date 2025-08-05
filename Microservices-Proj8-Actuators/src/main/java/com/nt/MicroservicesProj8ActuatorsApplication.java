 package com.nt;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MicroservicesProj8ActuatorsApplication {

	@Bean
	public LocalDateTime createLDT() {
		return LocalDateTime.now();
	}
	
	public static void main(String[] args) {
	
		SpringApplication.run(MicroservicesProj8ActuatorsApplication.class, args);
	}

}
