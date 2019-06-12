package com.tsiaparas.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

  public static void main(String[] args) {

    //load the spring configuration file
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    // retrive bean from spring container
    CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);

    // call methods on bean
    //System.out.println(theCoach.getFortuneService());
    //System.out.println(theCoach.getDailyWorkout());
    System.out.println("Email address: " + theCoach.getEmailAddress());
    System.out.println("Team: " + theCoach.getTeam());

    //close the context
    context.close();

  }
}
