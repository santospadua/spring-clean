package spring.laila.arch.di.qualifiers.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class WhatsAdmin implements Admin
{
	private ConfigUsers configuration;
	
	// With Autowird and using Qualifier as a parameter of an constructor
	@Autowired
	public WhatsAdmin(@Qualifier("systemUsers") ConfigUsers config)
	{
		this.configuration = config;
	}
	@Override
	public String getAccessLevel()
	{
		return "X2";
	}
	@Override
	public String getConfiguration()
	{
		return configuration.myUsers();
	}
}