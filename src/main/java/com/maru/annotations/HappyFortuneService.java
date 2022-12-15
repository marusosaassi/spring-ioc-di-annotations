package com.maru.annotations;

import org.springframework.stereotype.Component;

@Component //add annotation so spring can register this service
public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }
}
