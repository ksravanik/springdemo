package spring_package;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//load the spring configuration file
		
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        // Retrieve bean from spring container
        
        Coach theCoach = context.getBean("myCoach", Coach.class);
        
        //call methods on the bean
        
        System.out.println(theCoach.getDailyWorkout());
        
        //Let's call our new method for fortunes
        
        System.out.println(theCoach.getDailyFortune());
        
        //close the context
        
        context.close();

	}

}
