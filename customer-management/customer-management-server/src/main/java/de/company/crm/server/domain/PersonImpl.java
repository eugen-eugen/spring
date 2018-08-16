package de.company.crm.server.domain;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import de.company.crm.api.domain.Address;
import de.company.crm.api.domain.Person;

@Entity
public class PersonImpl implements Person {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id;
	
	Date geburtsdatum;
	
	String nickName;
	
	String name;
	
	@OneToMany(targetEntity=AddressImpl.class, cascade=CascadeType.ALL)
	Collection<Address> addresses=new ArrayList<>();

	@Override
	public Integer calculateAge() {
		return Period.between(geburtsdatum.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), LocalDate.now()).getYears();
	}

	@Override
	public Date[] run(byte[] content) {
		return null;
	}

	@Override
	public void changeLastAddress(Address address, Boolean isLastOne) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name=name;

	}

	@Override
	public Collection<Address> getAddresses() {
		return addresses;
	}

	@Override
	public void addAddress(Address address) {
		addresses.add(address);

	}

	@Override
	public String getNickname() {
		return nickName;
	}

	@Override
	public Boolean isInRetirement() {
		return calculateAge()>=67;
	}

}
