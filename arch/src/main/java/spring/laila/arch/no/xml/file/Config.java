package spring.laila.arch.no.xml.file;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("spring.laila.arch.no.xml.file") <OPTIONAL> -> without code
@PropertySource("classpath:user.properties")
public class Config
{
	// Bean
	@Bean
	public ConfigUsers setConfiguration()
	{
		return new SystemUsers();
	}
	// Dependency Injection
	@Bean
	public Admin facebookAdmin() 
	{
		return new FacebookAdmin(setConfiguration());
	}
}