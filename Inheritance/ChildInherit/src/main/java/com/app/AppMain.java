package com.app;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

	public static void main(String[] args) {
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("bean.xml");
		CollectionsType ctype=(CollectionsType)context.getBean("CollectType");   
		System.out.println("Parent --> Child Inheritance");
        System.out.println("\nMobCompany List(ref)-->");
        System.out.println(ctype.getmCompany().get(0));
        System.out.println(ctype.getmCompany().get(1));
        System.out.println("\nList-->"+ctype.getMlist());
	}
}
