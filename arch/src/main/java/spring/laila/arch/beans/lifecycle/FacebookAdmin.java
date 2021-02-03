package spring.laila.arch.beans.lifecycle;

public class FacebookAdmin implements Admin
{
	private ConfigUsers configuration;
	
	// Init method
	public void doSomething()
	{
		System.out.println("Initializing");
	}
	// Destroy method not works with prototype scope
	// But we can implement a DisposableBean implementation to destroy
	public void destroy()
	{
		System.out.println("Destroying");
	}
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