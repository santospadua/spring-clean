package spring.laila.arch.di.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp
{
	private static ApplicationContext context;

	public static void main(String[] args)
	{
		context = new ClassPathXmlApplicationContext("applicationContext.xml");

		InstagramAdmin administrator1 = context.getBean("insta", InstagramAdmin.class);
		LinkedinAdmin administrator2 = context.getBean("link", LinkedinAdmin.class);

		System.out.println(administrator1.getOrder());
		System.out.println(administrator1.getResponsability());
		System.out.println(administrator1.getIdUser());

		System.out.println(administrator2.getOrder());
		System.out.println(administrator2.getResponsability());
	}
}