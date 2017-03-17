package spring_package;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		// Load the spring configuration file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// retrive bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		// Check if they are the same
		boolean result = (theCoach == alphaCoach);
		
		// Print out the results
		System.out.println("\n Pointing to the same object : " + result);
		
		System.out.println("\n Memory location for theCoach : " + theCoach);
		
		System.out.println("\n Memory location for aplhaCoach : " + alphaCoach +"\n");
		
		// Close the context
		context.close();

	}

}
