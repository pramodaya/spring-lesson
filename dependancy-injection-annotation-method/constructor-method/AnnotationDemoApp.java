package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		// read the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// get the bean from the spring container
		Coach theCoach = context.getBean("thatSillyCoach", Coach.class);

		 /*call method to get daily fortune through autowired constructor dependancy
		 injection */
		System.out.println(theCoach.getDailyFortune());
		
		// close the context
		context.close();
	}

}
