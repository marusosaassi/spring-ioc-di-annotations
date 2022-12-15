package com.maru.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //Spring will automatically register this bean
public class TennisCoach implements Coach{

    private FortuneService fortuneService;

    @Autowired //2. Configuring the dependency injection with @Autowired annotation
    //1. creating constructor
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    //spring will sacan for a component that implements the FortuneService interface, in our case is the HappyFortune

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
