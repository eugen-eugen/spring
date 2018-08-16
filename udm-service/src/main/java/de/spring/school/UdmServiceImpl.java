package de.spring.school;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UdmServiceImpl implements UdmService {

	@Autowired Calculator calc;

	@Override
	public String findUdmUserById(Long id) {
		return "user" + id;
	}

}
