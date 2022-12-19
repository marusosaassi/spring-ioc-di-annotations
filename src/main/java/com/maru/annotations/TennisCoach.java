package com.maru.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //Spring will automatically register this bean
public class TennisCoach implements Coach{

    private FortuneService fortuneService;

    //using constructor injection:
    /*@Autowired //2. Configuring the dependency injection with @Autowired annotation
    //1. creating constructor
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    //spring will sacan for a component that implements the FortuneService interface, in our case is the HappyFortune
    */

    //default constructor:
    public TennisCoach() {
        System.out.println(">> TennisCoach: inside default constructor.");
    }

    //defining setter method for injections
    @Autowired //we tell spring to autowire this dependency
    public void setFortuneService(FortuneService fortuneService){
        System.out.println(">> TennisCoach: inside setFortuneService() method");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
