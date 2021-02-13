package spring.laila.arch.beans.annotations;

import org.springframework.stereotype.Component;

@Component
public class SystemUsers implements ConfigUsers
{
	@Override
	public String myUsers()
	{
		return "Antonio";
	}
}