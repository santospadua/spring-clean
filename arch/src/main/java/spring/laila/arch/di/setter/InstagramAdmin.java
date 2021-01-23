package spring.laila.arch.di.setter;

public class InstagramAdmin implements Admin
{
	private Responsability responsability;
	private String idUser;

	public String getIdUser()
	{
		return idUser;
	}
	public void setIdUser(String idUser)
	{
		this.idUser = idUser;
	}
	public void setResponsability(Responsability responsability)
	{
		this.responsability = responsability;
	}
	@Override
	public String getOrder()
	{
		return "People searching ...";
	}
	@Override
	public String getResponsability()
	{
		return responsability.getResponsability();
	}
}