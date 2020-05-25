package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RandomFortuneApp {

    public static void main(String[] args) {

        //load the spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve a bean from the spring container
        SwimCoach theCoach = context.getBean("mySwimCoach", SwimCoach.class);

        //call methods on the bean
        System.out.println(theCoach.getDailyWorkout());

        // let's call our new method for fortunes
        System.out.println(theCoach.getDailyFortune());

        //close the context.
        context.close();

    }

}
