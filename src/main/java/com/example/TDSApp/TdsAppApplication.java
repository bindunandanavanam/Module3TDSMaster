package com.example.TDSApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan("com.tds.maincontroller")
@ComponentScan("com.tds.dao")
@ComponentScan("com.tds.service")
@ComponentScan("com.model")
@EntityScan(basePackages = {"com.tds.model"})
@SpringBootApplication
public class TdsAppApplication {
	//main application

	public static void main(String[] args) {
		SpringApplication.run(TdsAppApplication.class, args);
	}

}
