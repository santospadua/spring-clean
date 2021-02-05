package spring.laila.arch.ic.annotations;

import org.springframework.stereotype.Component;

@Component
public class WhatsAdmin implements Admin
{
	@Override
	public String getAccessLevel()
	{
		return "X2";
	}
}