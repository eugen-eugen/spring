package de.company.crm.server.domain;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import de.company.crm.api.domain.Address;
import de.company.crm.api.domain.AddressType;
import de.company.crm.api.domain.Person;

@Entity
public class AddressImpl implements Address {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id;
	
	String street;
	AddressType addressType;
	
	@ManyToOne(targetEntity=PersonImpl.class)
	Person person;

	@Override
	public Collection<String> getNewAddresses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getStreet() {
		return street;
	}

	@Override
	public void setStreet(String street) {
		this.street=street;

	}

	@Override
	public Person getPerson() {
		return person;
	}

	@Override
	public void setPerson(Person person) {
		this.person=person;

	}

	@Override
	public AddressType getAddressType() {
		return addressType;
	}

	@Override
	public void setAddressType(AddressType addressType) {
       this.addressType=addressType;
	}

	@Override
	public boolean isOld() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setOld(boolean old) {
		// TODO Auto-generated method stub

	}

}
