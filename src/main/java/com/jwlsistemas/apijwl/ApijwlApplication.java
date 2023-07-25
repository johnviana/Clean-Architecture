package com.jwlsistemas.apijwl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ApijwlApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApijwlApplication.class, args);
	}

}
