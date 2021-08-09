package verify;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beans.Manager;
import configuration.ApplicationConfig;

public class Verify 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
	    Manager  obj = (Manager) context.getBean("ConfigurationExample");
	    System.out.println( obj.getServiceName());
	}
}
