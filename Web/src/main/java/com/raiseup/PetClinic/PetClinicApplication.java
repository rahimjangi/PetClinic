package com.raiseup.PetClinic;

import com.raiseup.PetClinic.bootstrap.ProfileInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@Slf4j
@SpringBootApplication
public class PetClinicApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(PetClinicApplication.class, args);

		ProfileInfo profileInfo = context.getBean(ProfileInfo.class);
		System.out.print("Active profiles: ");
		Arrays.stream(profileInfo.getActiveProfile()).forEach(System.out::println);


	}

}
