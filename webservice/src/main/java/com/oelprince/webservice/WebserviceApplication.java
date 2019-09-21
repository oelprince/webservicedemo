package com.oelprince.webservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class WebserviceApplication extends SpringBootServletInitializer {
	// silence console logging
	@Value("${logging.level.root:OFF}")
	String message = "";
	public static void main(String[] args) {
		SpringApplication.run(WebserviceApplication.class, args);
	}

}
