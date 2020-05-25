package com.luv2code.springdemo;

public class SwimCoach implements Coach {

    private RandomFortuneService randomFortuneService;

    // added this no-arg constructor to resolve a problem with MyApp.java.
    public SwimCoach() {

    }

    public SwimCoach(RandomFortuneService randomFortuneService) {
        this.randomFortuneService = randomFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000m";
    }

    @Override
    public String getDailyFortune() {
        return randomFortuneService.getFortune();
    }

}
