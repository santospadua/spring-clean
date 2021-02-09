package spring.laila.arch.di.qualifiers.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FacebookAdmin implements Admin
{
	@Autowired
	@Qualifier("databaseUsers")
	private ConfigUsers configuration;
	
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