package spring.laila.arch.di.setter;

public class LinkedinAdmin implements Admin
{
	private Responsability responsability;

	public void setResponsability(Responsability responsability)
	{
		this.responsability = responsability;
	}
	@Override
	public String getOrder()
	{
		return "Job searching ...";
	}
	@Override
	public String getResponsability()
	{
		return responsability.getResponsability();
	}
}