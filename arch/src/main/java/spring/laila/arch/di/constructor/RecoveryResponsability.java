package spring.laila.arch.di.constructor;

public class RecoveryResponsability implements Responsability
{
	@Override
	public String getResponsability()
	{
		return "Checking user login recovery, this is the dependecy!";
	}
}