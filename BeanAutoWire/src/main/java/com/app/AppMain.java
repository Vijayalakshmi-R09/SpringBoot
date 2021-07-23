package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Student student = (Student)context.getBean("stud1");
		System.out.println("Autowiring ByName");
		student.setStudid(101);
		student.setStudName("Michael");
		System.out.println("\nStudent Details: \n-----------------------\n"+student+student.getDepartment());
		Student studentbyType=(Student)context.getBean("stud2");
		System.out.println("\nAutowiring ByType");
		System.out.println("\nStudent Details: \n-----------------------\n"+studentbyType+studentbyType.getDepartment());

	}
}
