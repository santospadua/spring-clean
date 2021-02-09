package spring.laila.arch.di.qualifiers.annotations;

import org.springframework.stereotype.Component;

@Component
public class DatabaseUsers implements ConfigUsers
{
	@Override
	public String myUsers()
	{
		return "Rodrigues";
	}
}