package spring_package;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// load the spring configuration file
        ClassPathXmlApplicationContext context = 
                new ClassPathXmlApplicationContext ("applicationContext.xml");
        
        //retrieve bean form spring container
        CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
        
        // Call methods on the bean
        //....let's come back to this......
        
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        
        //Call our new methods to get the literal values
        System.out.println(theCoach.getEmailAddress());
        System.out.println(theCoach.getTeam());
        
        //close the context
        context.close();
		
	}

}
