package spring.laila.arch.di.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp
{
	private static ApplicationContext context;

	public static void main(String[] args)
	{
		context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Admin administrator1 = context.getBean("whats", Admin.class);
		Admin administrator2 = context.getBean("face", Admin.class);

		System.out.println(administrator1.getOrder());
		System.out.println(administrator2.getOrder());

		System.out.println(administrator1.getResponsability());
		System.out.println(administrator2.getResponsability());
	}
}