package spring.laila.arch.di.setter.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("faceAdmin")
public class FacebookAdmin implements Admin
{
	private ConfigUsers configuration;
	
	public FacebookAdmin(){}
	
	/*@Autowired
	public void setConfiguration(ConfigUsers config) 
	{
		this.configuration = config;
	}*/
	
	// This implementation works fine
	@Autowired
	public void take(ConfigUsers config) 
	{
		this.configuration = config;
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