package de.spring.school;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaConfigApplication implements CommandLineRunner{
	
	@Autowired
	ClientService getXx;

	public static void main(String[] args) {
		SpringApplication.run(JavaConfigApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	}
	
	
}
