package spring.laila.arch.di.constructor;

public class FacebookAdmin implements Admin
{
	private Responsability responsability;

	public FacebookAdmin(Responsability responsability)
	{
		this.responsability = responsability;
	}
	@Override
	public String getOrder()
	{
		return "Give me Mike Zuckerberg";
	}
	@Override
	public String getResponsability()
	{
		return responsability.getResponsability();
	}
}