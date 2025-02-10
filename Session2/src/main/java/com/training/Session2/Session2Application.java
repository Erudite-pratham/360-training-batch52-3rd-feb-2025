package com.training.Session2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Session2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Session2Application.class, args);

//		Coach coach = context.getBean("cricketCoach", Coach.class);
//		System.out.println(coach.getWorkout());
//		System.out.println(coach.getMyKit());
//
//		Coach coach1 = context.getBean("tennisCoach", Coach.class);
//		System.out.println(coach1.getWorkout());
//		System.out.println(coach1.getMyKit());

//		ObjectClass objectClass = context.getBean("objectClass", ObjectClass.class);
//		System.out.println(objectClass.hello());

		Animal animal = context.getBean("hello",Animal.class);
		System.out.println(animal.sound());
	}

}
