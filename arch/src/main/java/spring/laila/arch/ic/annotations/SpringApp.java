package spring.laila.arch.ic.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp
{
	private static ApplicationContext context;

	public static void main(String[] args)
	{
		// Application Context
		context = new ClassPathXmlApplicationContext("annotations-ic-applicationContext.xml");
		
		// Referencing beans
		Admin administrator1 = context.getBean("faceAdmin", Admin.class);
		
		// With the name of class
		Admin administrator2 = context.getBean("whatsAdmin", Admin.class);
		
		// Access level X1
		System.out.println(administrator1.getAccessLevel());
		
		// Access level X1
		System.out.println(administrator2.getAccessLevel());
		
		// Close context
		((AbstractApplicationContext) context).close();
	}
}