package de.company.crm;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import de.company.crm.api.exception.CreatePersonException;
import de.company.crm.api.service.person.PersonService;
import de.company.crm.server.domain.AddressImpl;
import de.company.crm.server.domain.PersonImpl;
import de.company.crm.server.repository.PersonRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerManagementServerApplicationTests {
	
	@Autowired
	PersonService personService;
	@Autowired
	PersonRepository personRepository;

	PersonImpl person = new PersonImpl();
	@Test
	public void contextLoads() throws CreatePersonException {
		personService.createAddressFromPerson(new AddressImpl(), person);
	}

	@Before
	public void setUp()
	{
		personRepository.save(person);
	}
}
