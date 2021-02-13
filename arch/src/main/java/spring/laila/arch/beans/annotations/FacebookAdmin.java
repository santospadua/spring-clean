package spring.laila.arch.beans.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FacebookAdmin implements Admin
{
	@Autowired
	private ConfigUsers configuration;
	
	// Init method
	@PostConstruct
	public void doSomething()
	{
		System.out.println("Initializing");
	}
	// Destroy method not works with prototype scope
	// But we can implement a DisposableBean implementation to destroy
	@PreDestroy
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