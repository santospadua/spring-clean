package spring.laila.arch.di.fields.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp
{
	private static ApplicationContext context;

	public static void main(String[] args)
	{
		// Application Context
		context = new ClassPathXmlApplicationContext("annotations-di-fields-applicationContext.xml");
		
		// Referencing beans
		Admin administrator1 = context.getBean("faceAdmin", Admin.class);
		
		// Access level X1
		System.out.println(administrator1.getAccessLevel());
		System.out.println(administrator1.getConfiguration());
		
		// Close context
		((AbstractApplicationContext) context).close();
	}
}