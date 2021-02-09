package spring.laila.arch.di.properties.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp
{
	private static ApplicationContext context;

	public static void main(String[] args)
	{
		// Application Context
		context = new ClassPathXmlApplicationContext("annotations-di-properties-applicationContext.xml");
		
		// Referencing beans
		FacebookAdmin administrator1 = context.getBean("facebookAdmin", FacebookAdmin.class);
		
		// Accessing the fields
		System.out.println(administrator1.getAccessLevel());
		System.out.println(administrator1.getConfiguration());
		System.out.println(administrator1.getNumberl());
		
		// Close context
		((AbstractApplicationContext) context).close();
	}
}