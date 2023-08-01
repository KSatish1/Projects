package com.te.aehr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "AyurEHR Project",
				version = "1.0.0", description = "Hospital Management System", termsOfService = "As of now Nothing", contact = @Contact(name = "K.Satish", email = "ksatishcerous@gmail.com"), license = @License(name = "AyurEHR Licence", url = "Currently not available")))
public class AyurEhrApplication {

	public static void main(String[] args) {
		SpringApplication.run(AyurEhrApplication.class, args);
	}

}
