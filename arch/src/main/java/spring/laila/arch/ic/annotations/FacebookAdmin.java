package spring.laila.arch.ic.annotations;

import org.springframework.stereotype.Component;

@Component("faceAdmin")
public class FacebookAdmin implements Admin
{
	@Override
	public String getAccessLevel()
	{
		return "X1";
	}
}