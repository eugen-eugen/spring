package de.spring.school.jewgenij;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JewgenijApplication {
	
	Logger logger=LoggerFactory.getLogger(JewgenijApplication.class.getName());
	
	@Autowired
	Calculator calc;

	public static void main(String[] args) {
		SpringApplication.run(JewgenijApplication.class, args);
	}

	
	@Bean
	Calculator getCalc()
	{
		return new Calculator();
	}
}
