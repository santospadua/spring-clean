package spring.laila.arch.ic.annotations;

import org.springframework.stereotype.Component;

// Without set name
@Component
public class WhatsAdmin implements Admin
{
	@Override
	public String getAccessLevel()
	{
		return "X2";
	}
}