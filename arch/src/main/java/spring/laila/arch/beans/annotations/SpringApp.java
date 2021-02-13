package spring.laila.arch.beans.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp
{
	private static ApplicationContext context;

	public static void main(String[] args)
	{
		// Application Context
		context = new ClassPathXmlApplicationContext("annotations-beans-lifecycle-applicationContext.xml");
		
		// Referencing beans
		Admin administrator1 = context.getBean("facebookAdmin", Admin.class);
		Admin administrator2 = context.getBean("facebookAdmin", Admin.class);
		
		// Referencing beans
		Admin administrator3 = context.getBean("whatsAdmin", Admin.class);
		Admin administrator4 = context.getBean("whatsAdmin", Admin.class);
		
		// One object for the two references == true
		// Different objects for the two references == false (prototype)
		System.out.println(administrator1 == administrator2);
		System.out.println(administrator3 == administrator4);
		
		((AbstractApplicationContext) context).close();
	}
}