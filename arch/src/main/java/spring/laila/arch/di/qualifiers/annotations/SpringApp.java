package spring.laila.arch.di.qualifiers.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp
{
	private static ApplicationContext context;

	public static void main(String[] args)
	{
		// Application Context
		context = new ClassPathXmlApplicationContext("annotations-di-qualifiers-applicationContext.xml");
		
		// Referencing beans
		Admin administrator1 = context.getBean("facebookAdmin", Admin.class);
		Admin administrator2 = context.getBean("whatsAdmin", Admin.class);
		
		// Access level X1 and Rodrigues
		System.out.println(administrator1.getAccessLevel());
		System.out.println(administrator1.getConfiguration());
		
		// Access level X2 and Padua
		System.out.println(administrator2.getAccessLevel());
		System.out.println(administrator2.getConfiguration());
			
		// Close context
		((AbstractApplicationContext) context).close();
	}
}