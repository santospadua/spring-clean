package spring.laila.arch.di.constructor.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("faceAdmin")
public class FacebookAdmin implements Admin
{
	private ConfigUsers configuration;
	
	// For dependency injection if you have more one constructor
	@Autowired
	public FacebookAdmin(ConfigUsers config)
	{
		configuration = config;
	}
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