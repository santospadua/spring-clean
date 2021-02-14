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
		
		// Returning...
		System.out.println(administrator1.getAccessLevel());
		System.out.println(administrator1.getConfiguration());
		
		// Close context
		((AbstractApplicationContext) context).close();
	}
}