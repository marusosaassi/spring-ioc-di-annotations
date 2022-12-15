package com.maru.annotations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class AnnotationsApplication {

	public static void main(String[] args) {
		//SpringApplication.run(AnnotationsApplication.class, args);
		//read spring config file
		ClassPathXmlApplicationContext context =
			new ClassPathXmlApplicationContext("applicationContext.xml");

		// get the bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		//activity
		//Coach soccerCoach = context.getBean("soccerCoach", Coach.class);

		//call a methd on the bean
		System.out.println(theCoach.getDailyWorkout());
		//System.out.println(soccerCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());

		//close the context
		context.close();
	}

}
