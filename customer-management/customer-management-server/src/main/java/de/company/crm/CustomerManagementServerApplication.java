package de.company.crm;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.company.crm.server.domain.AddressImpl;
import de.company.crm.server.domain.PersonImpl;
import de.company.crm.server.repository.AddressRepository;
import de.company.crm.server.repository.PersonRepository;

@SpringBootApplication
public class CustomerManagementServerApplication implements CommandLineRunner{

	@Autowired
	AddressRepository addressRepository;
	@Autowired
	PersonRepository personRepository;
	public static void main(String[] args) {
		SpringApplication.run(CustomerManagementServerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		PersonImpl person = new PersonImpl();
		person.addAddress(new AddressImpl());
		personRepository.save(person);
		System.out.println(addressRepository.count());
		Optional<AddressImpl> findAddr = addressRepository.findById(1L);
		findAddr.get();
		
	}
}
