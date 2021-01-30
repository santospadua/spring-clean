package spring.laila.arch.ic.container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp
{
	private static ApplicationContext context;

	public static void main(String[] args)
	{
		// Application Context
		context = new ClassPathXmlApplicationContext("container-applicationContext.xml");
		
		// Referencing beans
		Admin administrator1 = context.getBean("faceAdmin", Admin.class);
		Admin administrator2 = context.getBean("whatsAdmin", Admin.class);
		
		// Access level X1
		System.out.println(administrator1.getAccessLevel());
		// Access level X2
		System.out.println(administrator2.getAccessLevel());
	}
}