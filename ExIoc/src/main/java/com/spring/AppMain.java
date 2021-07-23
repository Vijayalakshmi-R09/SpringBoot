package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

	  public static void main( String[] args )
	    {
	        System.out.println( "Inversion of Control..." );
	        System.out.println("---------------------------");
	        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
			User user=(User)context.getBean("Accid");
			System.out.println(user);
			System.out.println("\nDI Using Getter");
			System.out.println("---------------------------");
			User user1=(User)context.getBean("Accid");
			System.out.println(user1+"\nMobileCompany: "+user1.getMobile().getMobname()+"\nMobileModel: "+user1.getMobile().getModel());
	    }
	}
