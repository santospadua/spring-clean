package spring.laila.arch.di.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp
{
	private static ApplicationContext context;

	public static void main(String[] args)
	{
		// Application Context
		context = new ClassPathXmlApplicationContext("setter-dependency-applicationContext.xml");
		
		// Referencing beans
		WhatsAdmin administrator1 = context.getBean("whatsAdmin", WhatsAdmin.class);
		
		// Access level X1
		System.out.println(administrator1.getAccessLevel());
		
		// Antonio -> Super User
		System.out.println(administrator1.getMyUserConfiguration());
		
		((AbstractApplicationContext) context).close();
	}
}