package com.raiseup.PetClinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PetClinicApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(PetClinicApplication.class, args);
	}

}
