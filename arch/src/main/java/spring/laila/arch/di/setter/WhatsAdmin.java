package spring.laila.arch.di.setter;

public class WhatsAdmin implements Admin
{
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