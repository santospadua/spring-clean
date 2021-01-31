package spring.laila.arch.di.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp
{
	private static ApplicationContext context;

	public static void main(String[] args)
	{
		// Application Context
		context = new ClassPathXmlApplicationContext("constructor-dependency-applicationContext.xml");
		
		// Referencing beans
		Admin administrator1 = context.getBean("faceAdmin", Admin.class);
		
		// Access level X1
		System.out.println(administrator1.getAccessLevel());
		
		// Antonio -> Super User
		System.out.println(administrator1.getMyUserConfiguration());
	}
}