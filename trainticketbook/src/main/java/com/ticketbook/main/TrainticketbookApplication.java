package com.ticketbook.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.ticketbook.main.repo"})
public class TrainticketbookApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrainticketbookApplication.class, args);
	}
	
}