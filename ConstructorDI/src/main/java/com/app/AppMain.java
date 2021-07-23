package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

	public static void main(String[] args) 
	{
		    System.out.println( "Dependency Injection (Constructor)" );
	        System.out.println();
	        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
			Customer cust=(Customer)context.getBean("CustName");
			String cname=cust.getCustName();
			int age=cust.getAge();
			String status=cust.getDisplay().getMstatus();
			System.out.println("Customer details\n********************");
			System.out.println("\nCustomer_Name: "+cname+"\nCustomer_age: "+age+"\nMartialStatus: "+status);
	}
}
