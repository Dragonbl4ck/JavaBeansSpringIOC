package com.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainApp {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		helloWorld h1 = (helloWorld)context.getBean("bean1");
//		System.out.println(h1.getMensaje());
		System.out.println(h1.getMsj().getMensaje());
		((ConfigurableApplicationContext)context).close();
	}
	
}
