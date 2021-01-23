package spring.laila.arch.ic.container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp
{
	private static ApplicationContext context;

	public static void main(String[] args)
	{
		context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Admin administrator1 = context.getBean("admin1", Admin.class);
		Admin administrator2 = context.getBean("admin2", Admin.class);

		System.out.println(administrator1.getOrder());
		System.out.println(administrator2.getOrder());
	}
}