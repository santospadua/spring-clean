package spring.laila.arch.di.constructor;

public class WhatsAdmin implements Admin
{
	private Responsability responsability;

	public WhatsAdmin(Responsability responsability)
	{
		this.responsability = responsability;
	}
	@Override
	public String getOrder()
	{
		return "Wow, whatsapp is also administrate by Facebook!";
	}
	@Override
	public String getResponsability()
	{
		return responsability.getResponsability();
	}
}