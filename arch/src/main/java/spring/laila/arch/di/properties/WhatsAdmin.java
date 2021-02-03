package spring.laila.arch.di.properties;

public class WhatsAdmin implements Admin
{
	private ConfigUsers configuration;
	private String number;
	private String code;
	
	public WhatsAdmin(){}
	
	public String getCode()
	{
		return code;
	}
	public void setCode(String code)
	{
		this.code = code;
	}
	public String getNumber()
	{
		return number;
	}
	public void setNumber(String number)
	{
		this.number = number;
	}
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