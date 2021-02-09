package spring.laila.arch.di.properties.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FacebookAdmin implements Admin
{
	@Autowired
	private ConfigUsers configuration;
	
	// Accessing the properties file
	@Value("${user.number}")
	private String number;
	
	public String getNumberl()
	{
		return number;
	}
	public FacebookAdmin(){}
	
	@Override
	public String getAccessLevel()
	{
		return "X1";
	}
	@Override
	public String getConfiguration()
	{	
		return configuration.myUsers();
	}
}