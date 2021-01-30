package spring.laila.arch.ic.container;

public class WhatsAdmin implements Admin
{
	@Override
	public String getAccessLevel()
	{
		return "X2";
	}
}