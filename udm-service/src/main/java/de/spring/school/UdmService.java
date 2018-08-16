package de.spring.school;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public interface UdmService  {
	
	
	public String findUdmUserById(Long Id);

}
