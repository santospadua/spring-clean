package spring.laila.arch.no.xml.file;

public class FacebookAdmin implements Admin
{
	private ConfigUsers configuration;
	
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