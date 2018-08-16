package de.company.crm.server.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Component;

import de.company.crm.api.domain.Address;
import de.company.crm.api.domain.Person;
import de.company.crm.api.exception.CreatePersonException;
import de.company.crm.api.exception.FinderException;
import de.company.crm.api.service.person.PersonService;
import de.company.crm.server.domain.PersonImpl;
import de.company.crm.server.repository.AddressRepository;
import de.company.crm.server.repository.PersonRepository;

@Component
public class PersonServiceImpl implements PersonService {

	@Autowired
	AddressRepository addressRepository;
	@Autowired
	PersonRepository personRepository;

	@Override
	public Person createAddressFromPerson(Address address, Person person) throws CreatePersonException {
		Example<PersonImpl> of = Example.of((PersonImpl)person);
		List<PersonImpl> persona=personRepository.findAll(of);
		if (persona.size()!=1)
		{
			throw new CreatePersonException();
		}
		persona.get(0).addAddress(address);
		return persona.get(0);
	}

	@Override
	public Collection<Person> findAllPersons(Integer start, Integer length) throws FinderException {
		return new ArrayList<>(personRepository.findAll());
	}

	@Override
	public Collection<Person> findPersonsByName(String name) throws FinderException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Person> findPersonsByNameReturnStream(String name) throws FinderException {
		// TODO Auto-generated method stub
		return null;
	}

}
