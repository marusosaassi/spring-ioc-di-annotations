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
		Coach theCoach = context.getBean("tennisSpecialCoach", Coach.class);

		//call a methd on the bean
		System.out.println(theCoach.getDailyWorkout());

		//close the context
		context.close();
	}

}
