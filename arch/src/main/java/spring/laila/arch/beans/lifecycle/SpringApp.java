package spring.laila.arch.beans.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp
{
	private static ApplicationContext context;

	public static void main(String[] args)
	{
		// Application Context
		context = new ClassPathXmlApplicationContext("beans-scope-lifecycle-applicationContext.xml");
		
		// Referencing beans
		FacebookAdmin administrator1 = context.getBean("faceAdmin", FacebookAdmin.class);
		FacebookAdmin administrator2 = context.getBean("faceAdmin", FacebookAdmin.class);
		
		// One object for the two references == true
		// Different objects for the two references == false (prototype)
		System.out.println(administrator1 == administrator2);
		
		((AbstractApplicationContext) context).close();
	}
}