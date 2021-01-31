package spring.laila.arch.di.constructor;

public class FacebookAdmin implements Admin
{
	private ConfigUsers configuration;
	
	public FacebookAdmin(ConfigUsers configuration)
	{
		this.configuration = configuration;
	}
	@Override
	public String getAccessLevel()
	{
		return "X1";
	}
	// Recovery the information from constructor dependency
	@Override
	public String getMyUserConfiguration()
	{
		return this.configuration.myUsers();
	}
}