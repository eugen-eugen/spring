package de.spring.school;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UdmServiceApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(UdmServiceApplication.class, args);
	}
	
	@Autowired
	SolutionService solService;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
