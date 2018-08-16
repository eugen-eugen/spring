package de.spring.school;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class SolutionService {
	
	@Autowired
	UdmService udm;
	
	Set<String> getSolutionUsers()
	{
		Set<String> res= new HashSet<>();
		res.add(udm.findUdmUserById(1L));
		res.add(udm.findUdmUserById(1L));
		return res;
	}
	@PostConstruct
	void init()
	{
		System.out.println("post construct Solutionservice");
	}
	
	@PreDestroy
	void destroy()
	{
		System.out.println("pre destroy Solutionservice");
	}

}
