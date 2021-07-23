package com.app;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

	public static void main(String[] args) 
	{
		System.out.println("LifeCycle of Bean");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
	    LifeCycle bean = (LifeCycle) context.getBean("start");
	    bean.getMessage();
	    context.registerShutdownHook();
	}
}
