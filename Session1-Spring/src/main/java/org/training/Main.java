package org.training;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        CricketCoach coach = new CricketCoach();
//        System.out.println(coach.sayHello());

//        TennisCoach coach = new TennisCoach();
//        System.out.println(coach.sayHello());

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bhavin.xml");
        Coach coach = (Coach) context.getBean("coach1");
        System.out.println(coach.sayHello());
        System.out.println(coach.getSportsKit());
    }
}