package spring.laila.arch.no.xml.file;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class SpringApp
{
	public static void main(String[] args)
	{
		// Without XML file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		// Recovering bean
		Admin administrator1 = context.getBean("facebookAdmin", Admin.class);
		
		// Recovering bean
		FacebookAdmin administrator2 = context.getBean("facebookAdmin", FacebookAdmin.class);
		
		// Returning...
		System.out.println(administrator1.getAccessLevel());
		System.out.println(administrator1.getConfiguration());
		
		// From the properties file
		System.out.println("Number: " + administrator2.getNumber() + " " + "Code: " + administrator2.getCode());
		
		// Close context
		((AbstractApplicationContext) context).close();
	}
}