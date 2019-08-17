package tw.rex.java.spring.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	public String getUsername()
	{
		return "Rex";
	}
	
	public String getUsername2()
	{
		return "Bill";
	}
	
}
