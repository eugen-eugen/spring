package de.spring.school;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class AppConfig {

	@Bean
	public ClientService getXx() {
		System.out.println("clientservice1");
		return new ClientServiceImpl(clientDao());
	}
	@Bean
	public ClientService clientservice2() {
		System.out.println("clientservice2");
		return new ClientServiceImpl(clientDao());
	}
	@Bean
	public ClientDao clientDao() {
		System.out.println("clientDao");
		return  new ClientDaoImpl();
	}

}
