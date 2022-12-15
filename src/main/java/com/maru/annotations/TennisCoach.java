package com.maru.annotations;

import org.springframework.stereotype.Component;

@Component //Spring will automatically register this bean
public class TennisCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
}
