package com.maru.annotations;

import org.springframework.stereotype.Component;

@Component
public class SoccerCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice kicking the ball for 10 minutes";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
