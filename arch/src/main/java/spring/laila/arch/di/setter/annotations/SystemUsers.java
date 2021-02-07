package spring.laila.arch.di.setter.annotations;

import org.springframework.stereotype.Component;

@Component
public class SystemUsers implements ConfigUsers
{
	@Override
	public String myUsers()
	{
		return "Padua";
	}
}