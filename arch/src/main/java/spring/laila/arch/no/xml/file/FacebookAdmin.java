package spring.laila.arch.no.xml.file;

import org.springframework.beans.factory.annotation.Value;

public class FacebookAdmin implements Admin
{
	// From the properties file
	@Value("${user.number}")
	private String number;
	
	// From the properties file
	@Value("${user.code}")
	private String code;
	
	private ConfigUsers configuration;
	
	public FacebookAdmin(ConfigUsers config)
	{
		configuration = config;
	}
	public String getNumber()
	{
		return number;
	}
	public String getCode()
	{
		return code;
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