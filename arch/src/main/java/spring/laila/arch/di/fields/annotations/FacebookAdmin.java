package spring.laila.arch.di.fields.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("faceAdmin")
public class FacebookAdmin implements Admin
{
	@Autowired
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