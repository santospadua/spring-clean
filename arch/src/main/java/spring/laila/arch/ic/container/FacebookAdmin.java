package spring.laila.arch.ic.container;

public class FacebookAdmin implements Admin
{
	@Override
	public String getAccessLevel()
	{
		return "X1";
	}
}