package spring.laila.arch.beans.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class WhatsAdmin implements Admin
{
	@Autowired
	private ConfigUsers configuration;
	
	public WhatsAdmin() {}
	
	// Our setter method for inject dependency
	public void setConfiguration(ConfigUsers configuration)
	{
		this.configuration = configuration;
	}
	
	// Interface methods
	@Override
	public String getAccessLevel()
	{
		return "X2";
	}
	@Override
	public String getMyUserConfiguration()
	{
		return configuration.myUsers();
	}
}